package com.stackroute.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.stackroute")
@EnableWebMvc
public class Webconfig {
@Bean	
public ViewResolver getViewResolver() {
	return new InternalResourceViewResolver("/WEB-INF/view",".jsp");
	
}
@Bean
public DataSource getDataSource() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	dataSource.setUrl("jdbc:mysql://localhost:3306/highdb");
	dataSource.setUsername("root");
	dataSource.setPassword("Sai777$$");
	return dataSource;
}
@Bean
public JdbcTemplate jdbcTemplate() {
	return new JdbcTemplate(getDataSource());
}

}
