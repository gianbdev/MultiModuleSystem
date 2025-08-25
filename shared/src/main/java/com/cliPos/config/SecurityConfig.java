package com.cliPos.config;

import com.cliPos.security.jwt.JwtAuthenticationFilter;
import com.cliPos.security.jwt.JwtEntryPoint;
import com.cliPos.services.CustomUserServiceDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    private final CustomUserServiceDetails customUserServiceDetails;

    public SecurityConfig(CustomUserServiceDetails customUserServiceDetails) {
        this.customUserServiceDetails = customUserServiceDetails;
    }

    @Bean
    public AuthenticationManager authManager(HttpSecurity http, PasswordEncoder passwordEncoder)
            throws Exception {
        AuthenticationManagerBuilder authenticationManagerBuilder =
                http.getSharedObject(AuthenticationManagerBuilder.class);
        authenticationManagerBuilder.userDetailsService(customUserServiceDetails)
                .passwordEncoder(passwordEncoder);
        return authenticationManagerBuilder.build();
    }

  /*
  @Bean
  protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
            .cors(Customizer.withDefaults())
            .csrf(AbstractHttpConfigurer::disable)
            .authorizeHttpRequests(auth -> auth
                    .requestMatchers("/v3/api-docs/**", "/swagger-ui/**").permitAll()
                    .requestMatchers("/", "/api/login","/api/refresh-token", "/login/oauth2/**").permitAll()
                    .anyRequest().authenticated())
            .oauth2Login(oauth2 -> oauth2
                    .defaultSuccessUrl("/login-success", true)
                    .userInfoEndpoint(userInfo -> userInfo
                            .userService(customOAuth2UserService())))
            .httpBasic(Customizer.withDefaults())
            .exceptionHandling(exception -> exception
                    .authenticationEntryPoint(jwtEntryPoint()))
            .addFilterBefore(jwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);

    return http.build();
  }*/

    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity http)
            throws Exception {
        http.cors(Customizer.withDefaults())
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(
                        auth
                                -> auth.requestMatchers("/v3/api-docs/**", "/swagger-ui/**")
                                .permitAll()
                                .requestMatchers("/", "/saludo", "/api/login")
                                .permitAll()
                                .anyRequest()
                                .authenticated())
                .httpBasic(Customizer.withDefaults())
                .exceptionHandling(
                        exception -> exception.authenticationEntryPoint(jwtEntryPoint()))
                .addFilterBefore(jwtTokenFilter(),
                        UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

  /*
  @Bean
  public CustomOAuth2UserService customOAuth2UserService() {
    return new CustomOAuth2UserService();
  }*/

    @Bean
    public JwtAuthenticationFilter jwtTokenFilter() {
        return new JwtAuthenticationFilter();
    }

    @Bean
    public JwtEntryPoint jwtEntryPoint() {
        return new JwtEntryPoint();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}