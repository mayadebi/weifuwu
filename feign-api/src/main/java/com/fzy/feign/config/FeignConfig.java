package com.fzy.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class FeignConfig {
    @Bean
    public Logger.Level LogLevel(){
        return Logger.Level.FULL;
    }
}
