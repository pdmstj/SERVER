package kr.hs.study.myBatisPrj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class mavController {
    @GetMapping("/mav")
    public ModelAndView mav(){
        ModelAndView mav=new ModelAndView();

        mav.addObject("dto","Lay Devine Nicky");
        mav.setViewName("mav_result");
        return mav;
    }

}
