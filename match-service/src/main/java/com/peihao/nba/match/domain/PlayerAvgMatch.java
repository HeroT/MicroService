package com.peihao.nba.match.domain;

/**
 * Created by TPH on 2017/6/25.
 */
public class PlayerAvgMatch {
    private String playerId;
    private String name;
    private Double time;
    private Double shootGoal;
    private Double shootNum;
    private Double threeGoal;
    private Double threeNum;
    private Double freeGoal;
    private Double freeNum;
    private Double fRebound;
    private Double bRebound;
    private Double rebound;
    private Double assist;
    private Double fault;
    private Double steal;
    private Double foul;
    private Double block;
    private Double score;
    private Double value;
    private Double twoRate;
    private Double threeRate;

    public Double getTwoRate() {
        return twoRate;
    }

    public void setTwoRate(Double twoRate) {
        this.twoRate = twoRate;
    }

    public Double getThreeRate() {
        return threeRate;
    }

    public void setThreeRate(Double threeRate) {
        this.threeRate = threeRate;
    }

    public Double getFreeRate() {
        return freeRate;
    }

    public void setFreeRate(Double freeRate) {
        this.freeRate = freeRate;
    }

    private Double freeRate;

    public PlayerAvgMatch(String playerId, String name, Double time, Double shootGoal, Double shootNum, Double threeGoal, Double threeNum, Double freeGoal, Double freeNum, Double fRebound, Double bRebound, Double rebound, Double assist, Double fault, Double steal, Double foul, Double block, Double score, Double value, Double twoRate, Double threeRate, Double freeRate) {
        this.playerId = playerId;
        this.name = name;
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
        this.twoRate = twoRate;
        this.threeRate = threeRate;
        this.freeRate = freeRate;
    }

    public PlayerAvgMatch(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public Double getShootGoal() {
        return shootGoal;
    }

    public void setShootGoal(Double shootGoal) {
        this.shootGoal = shootGoal;
    }

    public Double getShootNum() {
        return shootNum;
    }

    public void setShootNum(Double shootNum) {
        this.shootNum = shootNum;
    }

    public Double getThreeGoal() {
        return threeGoal;
    }

    public void setThreeGoal(Double threeGoal) {
        this.threeGoal = threeGoal;
    }

    public Double getThreeNum() {
        return threeNum;
    }

    public void setThreeNum(Double threeNum) {
        this.threeNum = threeNum;
    }

    public Double getFreeGoal() {
        return freeGoal;
    }

    public void setFreeGoal(Double freeGoal) {
        this.freeGoal = freeGoal;
    }

    public Double getFreeNum() {
        return freeNum;
    }

    public void setFreeNum(Double freeNum) {
        this.freeNum = freeNum;
    }

    public Double getfRebound() {
        return fRebound;
    }

    public void setfRebound(Double fRebound) {
        this.fRebound = fRebound;
    }

    public Double getbRebound() {
        return bRebound;
    }

    public void setbRebound(Double bRebound) {
        this.bRebound = bRebound;
    }

    public Double getRebound() {
        return rebound;
    }

    public void setRebound(Double rebound) {
        this.rebound = rebound;
    }

    public Double getAssist() {
        return assist;
    }

    public void setAssist(Double assist) {
        this.assist = assist;
    }

    public Double getFault() {
        return fault;
    }

    public void setFault(Double fault) {
        this.fault = fault;
    }

    public Double getSteal() {
        return steal;
    }

    public void setSteal(Double steal) {
        this.steal = steal;
    }

    public Double getFoul() {
        return foul;
    }

    public void setFoul(Double foul) {
        this.foul = foul;
    }

    public Double getBlock() {
        return block;
    }

    public void setBlock(Double block) {
        this.block = block;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }
}
