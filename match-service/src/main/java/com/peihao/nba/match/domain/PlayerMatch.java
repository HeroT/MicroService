package com.peihao.nba.match.domain;

/**
 * Created by TPH on 2017/6/25.
 */
public class PlayerMatch {

    private Long id;
    private String name;
    private Integer matchNumber;
    private Double time;
    private String twoPt;
    private Double twoRate;
    private String threePt;
    private Double threeRate;
    private String penalty;
    private Double penaltyRate;
    private Double rebound;
    private Double assist;
    private Double steal;
    private Double block;
    private Double fault;
    private Double foul;
    private Double score;


    public PlayerMatch() {
    }

    public PlayerMatch(Long id, String name, Integer matchNumber, Double time, String twoPt, Double twoRate, String threePt, Double threeRate, String penalty, Double penaltyRate, Double rebound, Double assist, Double steal, Double block, Double fault, Double foul, Double score) {
        this.id = id;
        this.name = name;
        this.matchNumber = matchNumber;
        this.time = time;
        this.twoPt = twoPt;
        this.twoRate = twoRate;
        this.threePt = threePt;
        this.threeRate = threeRate;
        this.penalty = penalty;
        this.penaltyRate = penaltyRate;
        this.rebound = rebound;
        this.assist = assist;
        this.steal = steal;
        this.block = block;
        this.fault = fault;
        this.foul = foul;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMatchNumber() {
        return matchNumber;
    }

    public void setMatchNumber(Integer matchNumber) {
        this.matchNumber = matchNumber;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public String getTwoPt() {
        return twoPt;
    }

    public void setTwoPt(String twoPt) {
        this.twoPt = twoPt;
    }

    public Double getTwoRate() {
        return twoRate;
    }

    public void setTwoRate(Double twoRate) {
        this.twoRate = twoRate;
    }

    public String getThreePt() {
        return threePt;
    }

    public void setThreePt(String threePt) {
        this.threePt = threePt;
    }

    public Double getThreeRate() {
        return threeRate;
    }

    public void setThreeRate(Double threeRate) {
        this.threeRate = threeRate;
    }

    public String getPenalty() {
        return penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty;
    }

    public Double getPenaltyRate() {
        return penaltyRate;
    }

    public void setPenaltyRate(Double penaltyRate) {
        this.penaltyRate = penaltyRate;
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

    public Double getSteal() {
        return steal;
    }

    public void setSteal(Double steal) {
        this.steal = steal;
    }

    public Double getBlock() {
        return block;
    }

    public void setBlock(Double block) {
        this.block = block;
    }

    public Double getFault() {
        return fault;
    }

    public void setFault(Double fault) {
        this.fault = fault;
    }

    public Double getFoul() {
        return foul;
    }

    public void setFoul(Double foul) {
        this.foul = foul;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
