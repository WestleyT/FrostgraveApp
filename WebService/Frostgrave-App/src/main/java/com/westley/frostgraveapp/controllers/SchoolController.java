package com.westley.frostgraveapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.westley.frostgraveapp.data_access_objects.*;
import com.westley.frostgraveapp.models.*;

@RestController
@RequestMapping("schools")
public class SchoolController {

    @Autowired
    schoolDAO schoolDAO;

    @GetMapping(produces = "application/json")
    public List<School> getAllSchools() {
        return schoolDAO.findAllSchools();
    }

}