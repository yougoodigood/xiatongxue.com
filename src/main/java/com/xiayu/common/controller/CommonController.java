package com.xiayu.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Classname CommonController
 * @Description
 * @Author hello
 * @Date 2019/7/9 14:50
 * @Version 1.0
 **/
@RestController
public class CommonController {
    @GetMapping(value = "/error")
    public ModelAndView getError(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("common/error");
        return modelAndView;
    }

    @GetMapping(value = {"/index","/",""})
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
