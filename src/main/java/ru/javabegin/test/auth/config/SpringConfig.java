package ru.javabegin.test.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity(debug = true)
public class SpringConfig  {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{
        http
                .csrf(csrf-> csrf.disable())//отключаем CSRF для REST(если нужно)
                .authorizeHttpRequests(auth->auth
                        .anyRequest().permitAll()//разрешаем все
                )
                .formLogin(login->login.disable())//отключаем форму логина
                .httpBasic(basic->basic.disable());//отключаем basic auth
        return http.build();
    }
}


