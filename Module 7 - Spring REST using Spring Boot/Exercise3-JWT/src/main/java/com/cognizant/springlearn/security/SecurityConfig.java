package com.cognizant.springlearn.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

// Web Security Configuration class extending WebSecurityConfigurerAdapter
@Configuration
@EnableWebSecurity
@SuppressWarnings("deprecation")
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private static final Logger LOGGER = LoggerFactory.getLogger(SecurityConfig.class);

    // Configures in-memory users for basic authentication
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        LOGGER.info("START");
        auth.inMemoryAuthentication()
            .withUser("user").password(passwordEncoder().encode("pwd")).roles("USER")
            .and()
            .withUser("admin").password(passwordEncoder().encode("admin")).roles("ADMIN");
        LOGGER.info("END");
    }

    // Bean for BCrypt Password Encoder
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Configures HTTP security rules, endpoint protection, and registers JWT filter
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        LOGGER.info("START");
        httpSecurity.csrf().disable() // Disable CSRF for simplicity
            .httpBasic().and() // Enable HTTP Basic Auth for /authenticate
            .authorizeRequests()
            .antMatchers("/authenticate").hasAnyRole("USER", "ADMIN") // Allow authenticated users to get JWT
            .anyRequest().authenticated() // All other requests require authentication
            .and()
            .addFilter(new JwtAuthorizationFilter(authenticationManager())); // Add custom JWT authorization filter
        LOGGER.info("END");
    }
}
