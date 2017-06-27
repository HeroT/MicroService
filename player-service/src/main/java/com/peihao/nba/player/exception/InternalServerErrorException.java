package com.peihao.nba.player.exception;

import javax.servlet.ServletException;

/**
 * Created by LijingYe on 2017/06/25.
 */
public class InternalServerErrorException extends ServletException {
    public InternalServerErrorException() {
    }

    public InternalServerErrorException(String message) {
        super(message);
    }

    public InternalServerErrorException(String message, Throwable rootCause) {
        super(message, rootCause);
    }

    public InternalServerErrorException(Throwable rootCause) {
        super(rootCause);
    }
}
