package cn.itcase.Dao;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(path = "/user")
public class Spring_FileIUpLoad {
    /**
     * 传统方式发布文件
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(path = "/fileupload")
    public String Demo(HttpServletRequest request) throws Exception {
//先获取到要上传的目录
        String Path = request.getSession().getServletContext().getRealPath("/uploads");
//创建file对象,向该路径上传文件
        File file = new File(Path);
        //判断该文件是否存在,如果不存在就创建
        if (!file.exists()){
               file.mkdirs();
        }
        //创建磁盘文件项工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        //解析request对象
        List<FileItem> list = upload.parseRequest(request);
        //遍历
        for (FileItem fileItem : list) {
            //判断文件时普通文件还是上传文件
            if (fileItem.isFormField()){

            }else {
                //获取上传文件名称
                String name = fileItem.getName();
                //上传文件
                fileItem.write(new File(file,name));
                //删除临时文件
                fileItem.delete();
            }
        }
        return "SpringMVC";
    }

    /**
     * SpringMVC方式发布文件传输
     */
    @RequestMapping(path = "/fileupload1")
    public String Demo1(HttpServletRequest request,MultipartFile upload) throws Exception {
//先获取到要上传的目录
        String Path = request.getSession().getServletContext().getRealPath("/uploads");
//创建file对象,向该路径上传文件
        File file = new File(Path);
        //判断该文件是否存在,如果不存在就创建
        if (!file.exists()){
            file.mkdirs();
        }
       //获取文件名
        String name = upload.getOriginalFilename();
        //设置文件重名并覆盖
        String uuid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        //把文件的名称唯一化
        name=uuid+"_"+name;
        //上传文件
        upload.transferTo(new File(file,name));
        return "SpringMVC";
    }


}
