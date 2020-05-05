package com.westley.frostgraveapp.Frostgrave.App.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.westley.frostgraveapp.Frostgrave.App.data_access_objects.*;
import com.westley.frostgraveapp.Frostgrave.App.models.*;
import java.util.*;

@RequestMapping("soldiers")
@RestController
public class SoldierController {

    @Autowired
    soldierDAO soldierDAO;

    @GetMapping(produces = "application/json")
    public List<Soldier> getAllSoldiers() {
        return soldierDAO.getAllSoldiers();
    }

}