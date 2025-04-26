package com.jangsung.js_ridebook.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer
{
    @Bean
    public WebMvcConfigurer corsConfigurer()
    {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry)
            {
                // 모든 경로 허용
                // 화면 주소
                registry.addMapping("/**").allowedOrigins("http://localhost:5173").allowedMethods("GET","POST","PUT",
                        "DELETE","OPTIONS");
            }
        };
    }

}
