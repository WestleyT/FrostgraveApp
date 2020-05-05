package com.westley.frostgraveapp.Frostgrave.App.data_access_objects;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import org.springframework.jdbc.core.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.westley.frostgraveapp.Frostgrave.App.models.*;

@Repository
public class soldierDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Soldier> getAllSoldiers() {
        return jdbcTemplate.query("select * from lk_soldiers", new SoldierRowMapper());
    }

    private class SoldierRowMapper implements RowMapper<Soldier> {
        @Override
        public Soldier mapRow(ResultSet rs, int rowNum) throws SQLException {
            Soldier soldier = new Soldier();
            soldier.setId(rs.getInt("ID"));
            soldier.setName(rs.getString("SOLDIER"));
            soldier.setMove(rs.getInt("MOVE"));
            soldier.setFight(rs.getInt("FIGHT"));
            soldier.setShoot(rs.getInt("SHOOT"));
            soldier.setArmor(rs.getInt("ARMOR"));
            soldier.setWill(rs.getInt("WILL"));
            soldier.setHealth(rs.getInt("HEALTH"));
            soldier.setCost(rs.getInt("COST"));
            soldier.setNotes(rs.getString("NOTES"));

            return soldier;
        }
    }

}