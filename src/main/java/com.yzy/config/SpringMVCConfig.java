package com.yzy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.yzy.controller","com.yzy.config"})
@EnableWebMvc
public class SpringMVCConfig {
}
