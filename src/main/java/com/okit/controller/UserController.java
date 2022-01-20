package com.okit.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author:TYZC
 * @Date:2022/1/18
 * @Description:
 */
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("aaa")
    public String dealWith(@RequestParam("name")String name){
        System.out.println(name);
        return "error";
    }

    @RequestMapping("show/{id}/{name}")
    public ModelAndView test5(@PathVariable("id") Long ids , @PathVariable("name") String names){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","占位符映射：id:"+ids+";name:"+names);
        mv.setViewName("hello");
        return mv;
    }

    @ExceptionHandler
    public ModelAndView exceptionHandler(Exception ex){
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("exception", ex);
        System.out.println("in testExceptionHandler");
        return mv;
    }


}
