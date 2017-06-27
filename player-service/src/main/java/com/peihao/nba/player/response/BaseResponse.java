package com.peihao.nba.player.response;

/**
 * Created by LijingYe on 2017/06/24.
 */
public class BaseResponse {
    private String code;
    private String message;

    public BaseResponse() {
    }

    public BaseResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
