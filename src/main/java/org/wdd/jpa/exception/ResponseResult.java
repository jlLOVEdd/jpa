package org.wdd.jpa.exception;


public class ResponseResult {
    private String code;
    private String message;
    private String data;

    public ResponseResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public ResponseResult setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResponseResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getData() {
        return data;
    }

    public ResponseResult setData(String data) {
        this.data = data;
        return this;
    }
}
