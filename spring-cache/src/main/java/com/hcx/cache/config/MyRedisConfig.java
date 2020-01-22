package com.hcx.cache.config;

import com.hcx.cache.bean.Department;
import com.hcx.cache.bean.Employee;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import java.net.UnknownHostException;

/**
 * @ClassName MyRedisConfig
 * @Description TODO redis 缓存配置类，设置主cachemanager
 * @Author 贺楚翔
 * @Date 2020-01-22 10:12
 * @Version 1.0
 **/
@Configuration
public class MyRedisConfig {

    @Bean
    public RedisTemplate<Object, Employee> empTemplate(
            RedisConnectionFactory redisConnectionFactory)
            throws UnknownHostException {
        RedisTemplate<Object, Employee> template = new RedisTemplate<Object, Employee>();
        Jackson2JsonRedisSerializer<Employee> serializer = new Jackson2JsonRedisSerializer<>(Employee.class);
        template.setDefaultSerializer(serializer);
        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }
    @Primary
    @Bean
    public RedisCacheManager cacheManager(RedisTemplate<Object, Employee> empTemplate){
        RedisCacheManager cacheManager = new RedisCacheManager(empTemplate);
        cacheManager.setUsePrefix(true);
        return cacheManager;
    }

    @Bean
    public RedisTemplate<Object, Department> deptTemplate(
            RedisConnectionFactory redisConnectionFactory)
            throws UnknownHostException {
        RedisTemplate<Object, Department> template = new RedisTemplate<Object, Department>();
        Jackson2JsonRedisSerializer<Department> serializer = new Jackson2JsonRedisSerializer<>(Department.class);
        template.setDefaultSerializer(serializer);
        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }
    @Bean
    public RedisCacheManager deptcacheManager(RedisTemplate<Object, Department> deptTemplate){
        RedisCacheManager cacheManager = new RedisCacheManager(deptTemplate);
        cacheManager.setUsePrefix(true);
        return cacheManager;
    }
}
