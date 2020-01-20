package com.hcx.cache.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @ClassName MyKeyGenerator
 * @Description TODO
 * @Author 贺楚翔
 * @Date 2020-01-20 15:00
 * @Version 1.0
 **/
@Configuration
public class MyCacheConfig {

    @Bean
    public KeyGenerator keyGenerator(){
        return new KeyGenerator() {
            @Override
            public Object generate(Object target, Method method, Object... params) {
                return method.getName()+"["+ Arrays.asList(params).toString()+"]";
            }
        };
    }
}
