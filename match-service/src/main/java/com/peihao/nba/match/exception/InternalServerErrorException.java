package com.peihao.nba.match.exception;

import javax.servlet.ServletException;

/**
 * Created by TPH on 2017/6/25.
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
