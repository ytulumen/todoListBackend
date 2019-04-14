package com.yasin.backend.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "com.yasin.backend", excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Configuration.class)})
public class AppConfig {


}
