package com.stackroute.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@ComponentScan(basePackages="com.stackroute")
@EnableWebMvc
@EnableTransactionManagement(proxyTargetClass=true)
public class WebConfig{
	
	@Bean
	public ViewResolver getViewResolver() {
		return new InternalResourceViewResolver("/WEB-INF/view/", ".jsp");
	}
	
	//Hibernate needs connection with database
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/ShoopingCartApplication");
		dataSource.setUsername("root");
		dataSource.setPassword("Sai777$$");
		return dataSource;
		
	}
	
	//create the session factory and pass database for it
	@Bean
	@Autowired
	public LocalSessionFactoryBean getSessionFactory(DataSource datSource) {
		
		LocalSessionFactoryBean sessionfactory=new LocalSessionFactoryBean();
		sessionfactory.setDataSource(datSource);
		sessionfactory.setPackagesToScan("com.stackroute.model");
		Properties p=new Properties();
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		sessionfactory.setHibernateProperties(p);
		return sessionfactory;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager getTxnManager(SessionFactory sessionfactory) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionfactory);
		return txManager;
		  
	}

}
