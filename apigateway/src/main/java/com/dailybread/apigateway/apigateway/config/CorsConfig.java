// package com.dailybread.apigateway.apigateway.config;

// import org.springframework.cloud.gateway.config.GlobalCorsProperties;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.cors.CorsConfiguration;
// import org.springframework.web.cors.reactive.CorsWebFilter;
// import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

// @Configuration
// public class CorsConfig {

// @Bean
// public CorsWebFilter corsWebFilter() {
// CorsConfiguration config = new CorsConfiguration();
// config.addAllowedOrigin("https://mypos-gilt.vercel.app");
// config.addAllowedOrigin("http://localhost:5173"); // Optional: for dev
// config.setAllowCredentials(true);
// config.addAllowedMethod("*");
// config.addAllowedHeader("*");

// UrlBasedCorsConfigurationSource source = new
// UrlBasedCorsConfigurationSource();
// source.registerCorsConfiguration("/**", config);

// return new CorsWebFilter(source);
// }
// }
