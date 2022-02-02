package com.example.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * every-moment service gateway config
 */
@Configuration
public class EveryMomentGatewayFilterConfig {

    @Bean
    public RouteLocator everyMomentGatewayRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route(
                        r -> r.path("/every-moment/**")
                            .uri("http://localhost:9200")
                ).build();
    }

}
