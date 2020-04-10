package com.westley.frostgraveapp.Frostgrave.App.models;

public class School {

    private Integer id;
    private String school;
    private String aligned;
    private String neutral;
    private String opposed;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id) {
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getAligned() {
        return aligned;
    }

    public void setAligned(String aligned) {
        this.aligned = aligned;
    }

    public String getNeutral() {
        return neutral;
    }

    public void setNeutral(String neutral) {
        this.neutral = neutral;
    }

    public String getOpposed() {
        return opposed;
    }

    public void setOpposed(String opposed) {
        this.opposed = opposed;
    }
}