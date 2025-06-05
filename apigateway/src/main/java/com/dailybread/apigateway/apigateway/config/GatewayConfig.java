package com.dailybread.apigateway.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

        @Bean
        public RouteLocator customRoutes(RouteLocatorBuilder builder) {
                return builder.routes()

                                // User service
                                .route("user_route", r -> r.path("/user/**")
                                                .filters(f -> f.rewritePath("/user(?<segment>/?.*)",
                                                                "/api/user/${segment}"))
                                                .uri("lb://USERSERVICE"))

                                // Inventory service
                                .route("inventory_route", r -> r.path("/inventory/**")
                                                .filters(f -> f.rewritePath("/inventory(?<segment>/?.*)",
                                                                "/api/inventory${segment}"))
                                                .uri("lb://INVENTORY"))

                                // POS service
                                .route("pos_route", r -> r.path("/pos/**")
                                                .filters(f -> f.rewritePath("/pos(?<segment>/?.*)",
                                                                "/api/pos${segment}"))
                                                .uri("lb://POSMICROSERVICE"))

                                // Report service
                                .route("report_route", r -> r.path("/report/**")
                                                .filters(f -> f.rewritePath("/report(?<segment>/?.*)",
                                                                "/api/reports${segment}"))
                                                .uri("lb://REPORTANALYSIS"))

                                .build();
        }
}
