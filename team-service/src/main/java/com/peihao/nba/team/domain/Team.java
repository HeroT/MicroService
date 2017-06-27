package com.peihao.nba.team.domain;

/**
 * Created by TPH on 2017/6/25.
 */
public class Team {
    private Long id;
    private String name;
    private String engName;
    private String city;
    private String home;
    private String intro;
    private String conference;
    private String engDivision;
    private String cnDivision;
    private String coach;
    private String foundYear;
    private int capacity;
    private String image;

    public Team(Long id, String name, String engName, String city, String home, String intro, String conference, String engDivision, String cnDivision, String coach, String foundYear, int capacity, String image) {
        this.id = id;
        this.name = name;
        this.engName = engName;
        this.city = city;
        this.home = home;
        this.intro = intro;
        this.conference = conference;
        this.engDivision = engDivision;
        this.cnDivision = cnDivision;
        this.coach = coach;
        this.foundYear = foundYear;
        this.capacity = capacity;
        this.image = image;
    }

    public Team(){

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

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public String getEngDivision() {
        return engDivision;
    }

    public void setEngDivision(String engDivision) {
        this.engDivision = engDivision;
    }

    public String getCnDivision() {
        return cnDivision;
    }

    public void setCnDivision(String cnDivision) {
        this.cnDivision = cnDivision;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getFoundYear() {
        return foundYear;
    }

    public void setFoundYear(String foundYear) {
        this.foundYear = foundYear;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
