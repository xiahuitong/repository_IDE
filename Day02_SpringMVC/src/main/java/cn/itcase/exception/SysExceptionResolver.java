package cn.itcase.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SysExceptionResolver implements HandlerExceptionResolver {
    //自定义异常处理类
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        ex.printStackTrace();
        SysException e = null;
        // 获取到异常对象
          if(ex instanceof SysException)
          {
              e = (SysException) ex;
          }else {
              e = new SysException("请联系管理员");
          }
          ModelAndView mv = new ModelAndView();
          // 存入错误的提示信息
        mv.addObject("message", e.getMessage());
        // 跳转的Jsp页面
        mv.setViewName("error");
        return mv;
    }


}
