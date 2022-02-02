package com.example.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * candy service gateway config
 */
@Configuration
public class CandyGatewayFilterConfig {

    @Bean
    public RouteLocator candyGatewayRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route(
                        r -> r.path("/candy/**")
                                .filters(
                                        f -> f.addRequestHeader("reverse-proxy", "candy-gateway-sever")
                                                .addResponseHeader("response-server", "candy-service-server")
                                )
                            .uri("lb://CANDY-SERVICE-SERVER")
                ).build();
    }

}
