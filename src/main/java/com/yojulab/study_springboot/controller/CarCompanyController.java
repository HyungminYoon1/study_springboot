package com.yojulab.study_springboot.controller;


import com.yojulab.study_springboot.service.CarCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping
public class CarCompanyController {

    @Autowired
    CarCompanyService carCompanyService;

    @GetMapping("/carcompany/list")
    public ModelAndView selectSearch(@RequestParam Map<String, Object> params
            , ModelAndView modelAndView) {
        Object result = carCompanyService.getCarCompanyInfo(params);

        modelAndView.addObject("carCompanyInfo", result);

        modelAndView.setViewName("/WEB-INF/views/carcompany/list.jsp");
        return modelAndView;
    }
}
