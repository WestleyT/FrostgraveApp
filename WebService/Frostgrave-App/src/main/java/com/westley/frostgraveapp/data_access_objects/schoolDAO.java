package com.westley.frostgraveapp.data_access_objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import org.springframework.jdbc.core.RowMapper;

import com.westley.frostgraveapp.models.*;

@Repository
public class schoolDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<School> findAllSchools() {
        return jdbcTemplate.query("select * from lk_schools", new SchoolRowMapper());
    }

    private class SchoolRowMapper implements RowMapper<School> {
        @Override
        public School mapRow(ResultSet rs, int rowNum) throws SQLException {
            School school = new School();
            school.setId(rs.getInt("ID"));
            school.setSchool(rs.getString("SCHOOL"));
            school.setAligned(rs.getString("ALIGNED"));
            school.setNeutral(rs.getString("NEUTRAL"));
            school.setOpposed(rs.getString("OPPOSED"));
    
            return school;
        }
    }
}

