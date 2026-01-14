package com.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.beans.*;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student sd = new Student();
		sd.setRollno(rs.getInt("std_roll"));
		sd.setName(rs.getString("std_name"));
		sd.setMarks(rs.getFloat("std_marks"));
		
		return sd;
	}


}
