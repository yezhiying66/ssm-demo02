package com.yzy.config;


import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.yzy.service")
@PropertySource("classpath:jdbc.properties")
@Import({jdbcConfig.class,MyBatisConfig.class})
@EnableTransactionManagement
public class Springconfig {
}
