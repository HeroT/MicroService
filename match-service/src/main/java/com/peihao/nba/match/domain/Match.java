package com.peihao.nba.match.domain;

import java.util.Date;

/**
 * Created by TPH on 2017/6/24.
 */
public class Match {
    private Long id;
    private Long team1Id;
    private Long team2Id;
    private Integer score1;
    private Integer score2;
    private Date date;
    private String team1Name;
    private String team2Name;
    private String sDate;

    public Match(Long id, Long team1Id, Long team2Id, Integer score1, Integer score2, Date time) {
        this.id = id;
        this.team1Id = team1Id;
        this.team2Id = team2Id;
        this.score1 = score1;
        this.score2 = score2;
        this.date = time;
    }

    public Match() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTeam1Id() {
        return team1Id;
    }

    public void setTeam1Id(Long team1Id) {
        this.team1Id = team1Id;
    }

    public Long getTeam2Id() {
        return team2Id;
    }

    public void setTeam2Id(Long team2Id) {
        this.team2Id = team2Id;
    }

    public Integer getScore1() {
        return score1;
    }

    public void setScore1(Integer score1) {
        this.score1 = score1;
    }

    public Integer getScore2() {
        return score2;
    }

    public void setScore2(Integer score2) {
        this.score2 = score2;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTeam1Name() {
        return team1Name;
    }

    public void setTeam1Name(String team1Name) {
        this.team1Name = team1Name;
    }

    public String getTeam2Name() {
        return team2Name;
    }

    public void setTeam2Name(String team2Name) {
        this.team2Name = team2Name;
    }

    public String getsDate() {
        return sDate;
    }

    public void setsDate(String sDate) {
        this.sDate = sDate;
    }
}
