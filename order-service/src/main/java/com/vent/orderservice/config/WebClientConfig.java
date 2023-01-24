package com.vent.orderservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    @Bean
    public WebClient webClient() {  // bean will be created with the name 'webClient'
        return WebClient.builder().build();
    }
}
