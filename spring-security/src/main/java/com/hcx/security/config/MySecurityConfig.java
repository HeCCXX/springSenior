package com.hcx.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @ClassName MySecurityConfig
 * @Description TODO
 * @Author 贺楚翔
 * @Date 2020-03-06 15:00
 * @Version 1.0
 **/
@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //定制请求的授权规则
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("VIP1")
                .antMatchers("/level2/**").hasRole("VIP2")
                .antMatchers("/level3/**").hasRole("VIP3");
        http.formLogin().usernameParameter("user").passwordParameter("pwd").loginPage("/userlogin");

        http.logout().logoutSuccessUrl("/");

        http.rememberMe().rememberMeParameter("remeber");
    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("hcx").password("123456").roles("VIP1","VIP2")
//                .and()
//                .withUser("hgg").password("123456").roles("VIP3");
//    }


    @Bean
    @Override
    protected UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder().username("hcx").password("123456").roles("VIP1", "VIP2").build();
        return new InMemoryUserDetailsManager(user);
    }

}
