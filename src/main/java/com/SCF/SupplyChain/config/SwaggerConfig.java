package com.SCF.SupplyChain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .paths(new Paths())  // Ensures only API paths (endpoints) are included
                .components(new Components())  // Removes schemas
                .info(new Info()
                        .title("Example API")
                        .version("1.0")
                        .description("API documentation without schemas"));
    }
}