package com.peihao.nba.player.response;

/**
 * Created by LijingYe on 2017/06/25.
 */
public class PageInfo {
    private Integer number;
    private Integer size;

    public PageInfo() {
    }

    public PageInfo(Integer number, Integer size) {
        this.number = number;
        this.size = size;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
