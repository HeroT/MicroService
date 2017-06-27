package com.peihao.nba.match.domain;

import java.util.Date;

/**
 * Created by TPH on 2017/6/25.
 */
public class PlayerEachMatch {
    private Long id;
    private Long matchId;
    private String team;
    private String name;
    private String position;
    private int time;
    private int shootGoal;
    private int shootNum;
    private int threeGoal;
    private int threeNum;
    private int freeGoal;
    private int freeNum;
    private int fRebound;
    private int bRebound;
    private int rebound;
    private int assist;
    private int fault;
    private int steal;
    private int foul;
    private int block;
    private int score;
    private int value;
    private Date date;
    private String team1Id;
    private String team2Id;
    private int score1;
    private int score2;
    private String team1Name;
    private String team2Name;

    public PlayerEachMatch(){

    }

    public PlayerEachMatch(Long id, Long matchId, String team, String name, String position, int time, int shootGoal, int shootNum, int threeGoal, int threeNum, int freeGoal, int freeNum, int fRebound, int bRebound, int rebound, int assist, int fault, int steal, int foul, int block, int score, int value, Date date, String team1Id, String team2Id, int score1, int score2) {
        this.id = id;
        this.matchId = matchId;
        this.team = team;
        this.name = name;
        this.position = position;
        this.time = time;
        this.shootGoal = shootGoal;
        this.shootNum = shootNum;
        this.threeGoal = threeGoal;
        this.threeNum = threeNum;
        this.freeGoal = freeGoal;
        this.freeNum = freeNum;
        this.fRebound = fRebound;
        this.bRebound = bRebound;
        this.rebound = rebound;
        this.assist = assist;
        this.fault = fault;
        this.steal = steal;
        this.foul = foul;
        this.block = block;
        this.score = score;
        this.value = value;
        this.date = date;
        this.team1Id = team1Id;
        this.team2Id = team2Id;
        this.score1 = score1;
        this.score2 = score2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getShootGoal() {
        return shootGoal;
    }

    public void setShootGoal(int shootGoal) {
        this.shootGoal = shootGoal;
    }

    public int getShootNum() {
        return shootNum;
    }

    public void setShootNum(int shootNum) {
        this.shootNum = shootNum;
    }

    public int getThreeGoal() {
        return threeGoal;
    }

    public void setThreeGoal(int threeGoal) {
        this.threeGoal = threeGoal;
    }

    public int getThreeNum() {
        return threeNum;
    }

    public void setThreeNum(int threeNum) {
        this.threeNum = threeNum;
    }

    public int getFreeGoal() {
        return freeGoal;
    }

    public void setFreeGoal(int freeGoal) {
        this.freeGoal = freeGoal;
    }

    public int getFreeNum() {
        return freeNum;
    }

    public void setFreeNum(int freeNum) {
        this.freeNum = freeNum;
    }

    public int getfRebound() {
        return fRebound;
    }

    public void setfRebound(int fRebound) {
        this.fRebound = fRebound;
    }

    public int getbRebound() {
        return bRebound;
    }

    public void setbRebound(int bRebound) {
        this.bRebound = bRebound;
    }

    public int getRebound() {
        return rebound;
    }

    public void setRebound(int rebound) {
        this.rebound = rebound;
    }

    public int getAssist() {
        return assist;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }

    public int getFault() {
        return fault;
    }

    public void setFault(int fault) {
        this.fault = fault;
    }

    public int getSteal() {
        return steal;
    }

    public void setSteal(int steal) {
        this.steal = steal;
    }

    public int getFoul() {
        return foul;
    }

    public void setFoul(int foul) {
        this.foul = foul;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTeam1Id() {
        return team1Id;
    }

    public void setTeam1Id(String team1Id) {
        this.team1Id = team1Id;
    }

    public String getTeam2Id() {
        return team2Id;
    }

    public void setTeam2Id(String team2Id) {
        this.team2Id = team2Id;
    }

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public int getScore2() {
        return score2;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
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
}
