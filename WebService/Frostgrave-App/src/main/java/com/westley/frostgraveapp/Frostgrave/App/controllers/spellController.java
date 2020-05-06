package com.westley.frostgraveapp.Frostgrave.App.controllers;

import com.westley.frostgraveapp.Frostgrave.App.data_access_objects.spellDAO;
import com.westley.frostgraveapp.Frostgrave.App.models.*;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("spells")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class spellController {

    @Autowired
    spellDAO spellDAO;

    @GetMapping(produces = "application/json")
    public List<Spell> getAllSpells() {
        return spellDAO.getAllSpells();
    }

}