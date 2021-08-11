package com.comment.demo;




import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



@Configuration
public class Conection {

	

	@Bean
	public DriverManagerDataSource conec() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		dataSource.setUrl("jdbc:sqlserver://localhost;databasename=vehiculos_medellin");
		dataSource.setUsername("sa");
		dataSource.setPassword("123");
		return dataSource;
	}




}
