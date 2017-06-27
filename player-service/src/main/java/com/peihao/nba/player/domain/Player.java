package com.peihao.nba.player.domain;

import java.util.Date;

/**
 * Created by LijingYe on 2017/06/24.
 */
public class Player {
    private Long id;
    private String name;
    private Long teamId;
    private String position;
    private String height;
    private String weight;
    private Date birthday;
    private String university;
    private String turn;
    private String nation;
    private String salary;
    private String contract;
    private String sbirthday;
    private String image;

    public Player() {
    }

    public String getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(String sbirthday) {
        this.sbirthday = sbirthday;
    }

    public Player(Long id, String name, Long teamId, String position, String height, String weight, Date birthday, String university, String turn, String nation, String salary, String contract, String sbirthday, String image) {
        this.id = id;
        this.name = name;
        this.teamId = teamId;
        this.position = position;
        this.height = height;
        this.weight = weight;
        this.birthday = birthday;
        this.university = university;
        this.turn = turn;
        this.nation = nation;
        this.salary = salary;
        this.contract = contract;
        this.sbirthday = sbirthday;
        this.image = image;
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

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
