package cn.itcase.Utils;
import org.apache.commons.io.FileUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Aspect
@Component
public class Power {
    public Object aroundpower(ProceedingJoinPoint pjp) throws IOException {
        Object proceed=null;
        //格式化时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(new Date());
        //获取执行的方法名
        String name = pjp.getSignature().getName();
        Map map=new HashMap();
        map.put("时间","time");
        map.put("方法名","name");
        String str=null;
        try {
            proceed = pjp.proceed(pjp.getArgs());
            str=name+"方法执行成功";
            map.put("执行成功","str");
        } catch (Throwable throwable) {
           str=time+"---"+name+"方法发生异常";
        }finally {
            FileUtils.writeStringToFile(new File("C:\\Users\\XHT\\Desktop\\a.txt"),str,true);
        }
        return proceed;


    }
}
