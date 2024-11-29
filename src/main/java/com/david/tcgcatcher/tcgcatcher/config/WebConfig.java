package com.david.tcgcatcher.tcgcatcher.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Permitir solo rutas de la API
                .allowedOrigins("http://localhost:3000") // Permitir solicitudes desde React
                .allowedMethods("GET", "POST", "PUT", "DELETE"); // Métodos permitidos
    }
}