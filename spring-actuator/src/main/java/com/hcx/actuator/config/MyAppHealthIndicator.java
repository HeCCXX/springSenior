package com.hcx.actuator.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyAppHealthIndicator
 * @Description 自定义健康指标，有detail信息时需要配置是否展示
 * @Author 贺楚翔
 * @Date 2020-03-11 10:23
 * @Version 1.0
 **/
@Component
public class MyAppHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        return Health.up().withDetail("msg","服务异常导致未启动").build();
    }
}
