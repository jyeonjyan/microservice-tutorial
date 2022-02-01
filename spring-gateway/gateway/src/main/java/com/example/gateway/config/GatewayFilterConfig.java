package com.example.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayFilterConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route(r -> r.path("/every-moment/**")
                            .filters(f -> f.addRequestHeader("every-moment-request", "every-moment-request")
                                            .addResponseHeader("every-moment-response", "every-moment-response")
                            ).uri("http://localhost:9200")
                )
                .route(r -> r.path("/candy/**")
                            .filters(f -> f.addRequestHeader("candy-request", "candy-request")
                                            .addResponseHeader("candy-response", "candy-response")
                            ).uri("http://localhost:9201")
                )
                .build();
    }

}
