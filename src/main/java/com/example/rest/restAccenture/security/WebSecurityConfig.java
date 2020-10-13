package com.example.rest.restAccenture.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.example.rest.restAccenture.config.SegurancaConfig;

@Configuration
//@EnableWebSecurity
//xtends WebSecurityConfigurerAdapter
public class WebSecurityConfig {

	
	    @Autowired
		private SegurancaConfig userDetailService;

}
