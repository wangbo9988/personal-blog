package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName CentreController
 * @Description 页面跳转中心
 * @Author mr.wang
 * @Date 2019/12/29 8:11 上午
 * @Version 1.0
 */
@Controller
public class CentreController {

    @RequestMapping("/")
    public String toIndex() { return "index"; }

}
