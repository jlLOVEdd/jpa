package org.wdd.jpa.exception;

/**
 * @Description 系统业务异常
 * @Author weidongdong
 * @Date 2020/5/15 11:50
 * @Version 1.0
 */
public class BusinessException extends RuntimeException {

    public enum ExceptionStatus {

        SUCCESS("1","成功"),
        LOGIN_FAIL("00","登录失败");

        private String code;
        private String msg;

        ExceptionStatus(String code, String msg) {
            this.code = code;
            this.msg = msg;
        }

    }


    //异常码
    private String code;
    //异常信息
    private String msg;

    public BusinessException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BusinessException(ExceptionStatus exceptionStatus) {
        this.code = exceptionStatus.code;
        this.msg = exceptionStatus.msg;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
