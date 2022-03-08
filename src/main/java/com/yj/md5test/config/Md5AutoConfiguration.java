package com.yj.md5test.config;

import com.yj.md5test.service.Md5Service;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/3/8
 */
@Configuration
@EnableConfigurationProperties({RabbitProperties.class})
public class Md5AutoConfiguration {
    @Bean
    Md5Service md5Service() {
        return new Md5Service();
    }
}