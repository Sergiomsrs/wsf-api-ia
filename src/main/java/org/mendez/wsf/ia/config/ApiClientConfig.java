package org.mendez.wsf.ia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ApiClientConfig {


    @Bean
    public WebClient scheduleApiClient(WebClient.Builder builder) {
        return builder
                .baseUrl("http://localhost:8081/api/schedule")
                .build();
    }


}
