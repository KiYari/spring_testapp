package com.spring_example.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.spring_example.beans.music.*;

@Configuration
public class AppConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }
}
