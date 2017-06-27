package com.peihao.nba.player.exception;

/**
 * Created by LijingYe on 2017/06/25.
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
