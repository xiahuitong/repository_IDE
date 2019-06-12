package cn.itcase.exception;

public class SysException extends Exception {
    //自定义异常类
    private static final long serialVersionUID = 4055945147128016300L;
    // 异常提示信息
     private String message;
     public String getMessage() {        return message;    }
     public void setMessage(String message) {        this.message = message;    }
     public SysException(String message) {        this.message = message;    }



}
