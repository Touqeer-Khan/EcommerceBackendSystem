package com.scaler.ecommerce.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {


    @Bean
    public RestTemplate createRestTemplate() {

        return new RestTemplate();
    }

}
