package com.peihao.nba.match.exception;

/**
 * Created by TPH on 2017/6/25.
 */
public class PagingFailedException extends InternalServerErrorException {
    private Integer pageNumber;
    private Integer pageSize;

    public PagingFailedException(Integer pageNumber, Integer pageSize) {
        super("Paging Failed.");
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }
}