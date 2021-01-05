package com.abc.sa.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import lombok.SneakyThrows;

@Configuration
public class DataSourceConfig {
	
	@Profile("local")
	@Bean("dateSourceMall")
	@SneakyThrows
	public DataSource getDateSourceMall() {
		ComboPooledDataSource dateSource = new ComboPooledDataSource();
		dateSource.setUser("root");
		dateSource.setPassword("root");
		dateSource.setJdbcUrl("jdbc:mysql://pig.zlsrj.com:3306/mall?useUnicode=true&characterEncoding=utf8");
		dateSource.setDriverClass("com.mysql.cj.jdbc.Driver");
		return dateSource;
	}
	
	@Profile("dev")
	@Bean("dateSourceMallDev")
	@SneakyThrows
	public DataSource getDateSourceMallDev() {
		ComboPooledDataSource dateSource = new ComboPooledDataSource();
		dateSource.setUser("root");
		dateSource.setPassword("root");
		dateSource.setJdbcUrl("jdbc:mysql://pig.zlsrj.com:3306/mall_dev?useUnicode=true&characterEncoding=utf8");
		dateSource.setDriverClass("com.mysql.cj.jdbc.Driver");
		return dateSource;
	}
}
