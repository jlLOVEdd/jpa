package org.wdd.jpa.exception;

/**
 * @Description ExceptionStatus
 * @Author weidongdong
 * @Date 2020/5/15 14:15
 * @Version 1.0
 */
public enum ExceptionStatus {
    SUCCESS("test","sss");
    private String code;
    private String msg;

     ExceptionStatus(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
