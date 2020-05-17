package com.westley.frostgraveapp.Frostgrave.App.models;

public class Spell {
    private Integer id;
    private Integer schoolId;
    private String schoolName;
    private String name;
    private Integer castingNumber;
    private String category;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String name) {
        this.schoolName = name;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCastingNumber() {
        return castingNumber;
    }

    public void setCastingNumber(Integer castingNumber) {
        this.castingNumber = castingNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}