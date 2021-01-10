package com.abc.sa.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.abc.sa.mapper")
public class MybatisPlusConfig {

}
