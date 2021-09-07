package com.fitnesszone.productService.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fitnesszone.productService.filter.JwtFilter;

@Configuration
public class BeanConfig {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
 public FilterRegistrationBean jwtFiletBEan() {
		FilterRegistrationBean filter=new FilterRegistrationBean();
		filter.setFilter(new JwtFilter());
		filter.addUrlPatterns("api/v1/program/**");
	return filter;
	 
 }
}
