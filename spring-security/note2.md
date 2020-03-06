### spring-security安全认证
1、需要注意thymeleaf-extras-springsecurity4的版本，在大于spring-boot 2.0.7以上版本，在页面使用sec会无效。

2、高版本有passwordEncoder错误，需要使用UserDetailsService的withDefaultPasswordEncoder来编码密码