package com.bo.controller;

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
    public String toIndex() {
        return "index";
    }

    @RequestMapping("/toAboutus")
    public String toAboutus() {
        return "aboutus";
    }

    @RequestMapping("/toService")
    public String toService() {
        return "service";
    }

    @RequestMapping("/toContact")
    public String toContact() {
        return "contact";
    }

    @RequestMapping("/toBlog")
    public String toBlog() {
        return "blog";
    }

    @RequestMapping("/toBlogTimeline")
    public String toBlogTimeline() {
        return "blog-timeline";
    }

    @RequestMapping("/toBlogAll")
    public String toBlogAll() {
        return "blog-all";
    }

    @RequestMapping("/toPortfolio")
    public String toPortfolio() {
        return "portfolio";
    }

    @RequestMapping("/toPortfolioCode")
    public String toPortfolioCode() {
        return "portfolio-code";
    }

    @RequestMapping("/toPortfolioResources")
    public String toPortfolioResources() {
        return "portfolio-resources";
    }

    @RequestMapping("/toPricing")
    public String toPricing() {
        return "pricing";
    }
}
