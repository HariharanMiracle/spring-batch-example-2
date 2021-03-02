package com.darkdevil.springbatchexample2.mapper;

import com.darkdevil.springbatchexample2.model.Tutorial;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TutorialRowMapper implements RowMapper<Tutorial> {

    @Override
    public Tutorial mapRow(ResultSet rs, int rowNum) throws SQLException {



        Tutorial tutorial = new Tutorial();

        tutorial.setId(rs.getInt("id"));
        tutorial.setTutorial_title(rs.getString("tutorial_title"));
        tutorial.setTutorial_author(rs.getString("tutorial_author"));
        tutorial.setSubmission_date(rs.getString("submission_date"));
        return tutorial;
    }
}