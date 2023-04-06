package com.proyectoWebPatrones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public UserDetailsService users() {
        UserDetails adminSebas = User.builder()
                .username("Sebastian")
                .password("{noop}123")
                .roles("USER", "VENDEDOR", "ADMIN")
                .build();
        UserDetails adminAle = User.builder()
                .username("Alejandro")
                .password("{noop}123")
                .roles("USER", "VENDEDOR", "ADMIN")
                .build();
        UserDetails adminJuan = User.builder()
                .username("Juan")
                .password("{noop}123")
                .roles("USER", "VENDEDOR", "ADMIN")
                .build();
        UserDetails vendedor = User.builder()
                .username("rosa")
                .password("{noop}123")
                .roles("USER")
                .build();
        UserDetails usuario = User.builder()
                .username("pepito")
                .password("{noop}123")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(usuario, adminJuan, adminAle, adminSebas);
    }

}
