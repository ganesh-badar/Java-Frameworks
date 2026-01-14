package com.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {
	
	@Bean
	 public DriverManagerDataSource myDataSource() 
	
	{
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		 
		 datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		 datasource.setUrl("jdbc:mysql://localhost:3306/springdb");
		 datasource.setUsername("root");
		 datasource.setPassword("Ganesh@1351");
		 return datasource;
		 
	 }
	
	@Bean
	public NamedParameterJdbcTemplate npjdnctemplate() {
		
		NamedParameterJdbcTemplate jdbctemplate = new NamedParameterJdbcTemplate(myDataSource());
		
		return  jdbctemplate;
		
	}

}
