package com.westley.frostgraveapp.Frostgrave.App.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.westley.frostgraveapp.Frostgrave.App.data_access_objects.*;
import com.westley.frostgraveapp.Frostgrave.App.models.*;

@RequestMapping("schools")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SchoolController {

    @Autowired
    schoolDAO schoolDAO;

    @GetMapping(produces = "application/json")
    public List<School> getAllSchools() {
        return schoolDAO.findAllSchools();
    }

    @GetMapping(value = "/{schoolID}", produces = "application/json")
    public List<School> getSchoolById(@PathVariable Integer schoolID) {
        return schoolDAO.getSchoolById(schoolID);
    }

}