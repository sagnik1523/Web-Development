package com.qualifierAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.qualifierAnnotation")
public class AppConfiguration
{

}