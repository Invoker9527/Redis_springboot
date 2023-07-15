package com.atguigu.redis_springboot.config.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

/**
 * @author YangRuiHong
 * @create 2022-07-11 22:00
 * @description:
 */
@Configuration
public class jedisConfig {
    @Bean
    public Jedis redisTemplate() {
        return new Jedis("192.168.198.138", 6379);
    }
}
