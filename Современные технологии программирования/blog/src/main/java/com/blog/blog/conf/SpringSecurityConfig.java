package com.blog.blog.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user").password("{noop}1234").roles("AUTHUSER", "NOAUTHUSER")
                .and()
                .withUser("admin").password("{noop}12345").roles("AUTHUSER", "ADMIN", "NOAUTHUSER");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET,"/tags/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST,"/tags").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT,"/tags/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE,"/tags/**").hasRole("ADMIN")
                .and()
                .csrf().disable()
                .formLogin();
    }
}
