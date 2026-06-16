package com.star;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public ModelAndView home(ModelAndView mv) {
        mv.setViewName("index");
        System.out.println("home method called");
        return mv;
    }

//    @RequestMapping("/Add")
//    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {
//
//        int result = num1 + num2;
//
//
//        mv.addObject("Answer", result);
//        mv.setViewName("result");
//
//
//        return mv;
//    }

    @RequestMapping("/AddAlien")
    public String AddAlien(Alien alien, Model model) {

        model.addAttribute("alien", alien);
        return "result";
    }




}
