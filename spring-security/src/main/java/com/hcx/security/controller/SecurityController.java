package com.hcx.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName securityController
 * @Description 安全认证controller类
 * @Author 贺楚翔
 * @Date 2020-03-06 14:58
 * @Version 1.0
 **/
@Controller
public class SecurityController {
    private final String PREFIX = "pages/";
    /**
     * 欢迎页
     * @return
     */
    @GetMapping("/")
    public String index() {
        return "welcome";
    }

    /**
     * 登陆页
     * @return
     */
    @GetMapping("/userlogin")
    public String loginPage() {
        return PREFIX+"login";
    }


    /**
     * level1页面映射
     * @param path
     * @return
     */
    @GetMapping("/level1/{path}")
    public String level1(@PathVariable("path")String path) {
        return PREFIX+"level1/"+path;
    }

    /**
     * level2页面映射
     * @param path
     * @return
     */
    @GetMapping("/level2/{path}")
    public String level2(@PathVariable("path")String path) {
        return PREFIX+"level2/"+path;
    }

    /**
     * level3页面映射
     * @param path
     * @return
     */
    @GetMapping("/level3/{path}")
    public String level3(@PathVariable("path")String path) {
        return PREFIX+"level3/"+path;
    }
}
