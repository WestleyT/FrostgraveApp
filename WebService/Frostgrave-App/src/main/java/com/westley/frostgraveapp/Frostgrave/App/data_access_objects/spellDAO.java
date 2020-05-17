package com.westley.frostgraveapp.Frostgrave.App.data_access_objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.*;
import com.westley.frostgraveapp.Frostgrave.App.models.*;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;

@Repository
public class spellDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Spell> getAllSpells() {
        return jdbcTemplate.query("select lk_spells.ID, lk_schools.ID as SCHOOL_ID, lk_schools.SCHOOL as SCHOOL_NAME, lk_spells.NAME, CASTING_NUMBER, CATEGORY, DESCRIPTION from lk_spells left join lk_schools on lk_schools.ID = lk_spells.SCHOOL_ID ", new SpellRowMapper());
    }

    private class SpellRowMapper implements RowMapper<Spell> {
        @Override
        public Spell mapRow(ResultSet rs, int rowNum) throws SQLException {
            Spell spell = new Spell();
            spell.setId(rs.getInt("ID"));
            spell.setSchoolId(rs.getInt("SCHOOL_ID"));
            spell.setSchoolName(rs.getString("SCHOOL_NAME"));
            spell.setName(rs.getString("NAME"));
            spell.setCastingNumber(rs.getInt("CASTING_NUMBER"));
            spell.setCategory(rs.getString("CATEGORY"));
            spell.setDescription(rs.getString("DESCRIPTION"));

            return spell;

        }
    }
}