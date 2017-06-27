package com.peihao.nba.match.reponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Created by TPH on 2017/6/24.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"code", "message", "data", "total", "page"})
public class SuccessResponse extends BaseResponse {
    private Object data;
    private Integer total;
    private PageInfo page;

    public SuccessResponse() {
        super("200", "OK.");
    }

    public SuccessResponse(Object data) {
        this();
        this.data = data;
    }

    public SuccessResponse(Object data, Integer total, PageInfo page) {
        this(data);
        this.total = total;
        this.page = page;
    }

    public SuccessResponse(Object data, Integer total, Integer pageNumber, Integer pageSize) {
        this(data,total,new PageInfo(pageNumber, pageSize));
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public PageInfo getPage() {
        return page;
    }

    public void setPage(PageInfo page) {
        this.page = page;
    }
}