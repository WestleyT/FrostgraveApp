package com.westley.frostgraveapp.Frostgrave.App.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.westley.frostgraveapp.Frostgrave.App.data_access_objects.*;
import com.westley.frostgraveapp.Frostgrave.App.models.*;

@RequestMapping("schools")
@RestController
public class SchoolController {

    @Autowired
    schoolDAO schoolDAO;

    @GetMapping(produces = "application/json")
    public List<School> getAllSchools() {
        return schoolDAO.findAllSchools();
    }

}