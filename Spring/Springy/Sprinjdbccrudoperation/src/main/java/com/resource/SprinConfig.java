package com.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SprinConfig
{
	
	@Bean
	public  DriverManagerDataSource myDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springdb");
		dataSource.setUsername("root");
		dataSource.setPassword("Ganesh@1351");
		
		
		return dataSource;
		
	}
	@Bean
	public JdbcTemplate myJdbcTemplate() {
		  JdbcTemplate jdbcTemplate = new JdbcTemplate();
		  jdbcTemplate.setDataSource(myDataSource());
		  return jdbcTemplate;
	}
}
 