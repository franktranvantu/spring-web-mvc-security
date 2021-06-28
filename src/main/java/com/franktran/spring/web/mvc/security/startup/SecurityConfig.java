package com.franktran.spring.web.mvc.security.startup;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication()
        .withUser("frank")
        .password("{noop}frank123")
        .roles("ADMIN")
        .and()
        .withUser("student")
        .password("{noop}student123")
        .roles("STUDENT");
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .authorizeRequests()
        .antMatchers("/all-students").permitAll()
        .antMatchers("/insert-student").hasRole("ADMIN")
        .and()
          .formLogin()
        .and()
          .httpBasic();
  }
}
