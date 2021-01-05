package com.abc.sa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.abc.sa.bean.Car;
import com.abc.sa.bean.Color;

@Configuration
public class ColorConfig {

	@Bean
	@Primary
	public Color getColor(Car car) {
		Color color = new Color();
		color.setCar(car);
		return color;
	}

}
