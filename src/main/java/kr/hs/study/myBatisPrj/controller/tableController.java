package kr.hs.study.myBatisPrj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class tableController {
    @GetMapping("t_Table")
    public String t_input(){
        return "t_input";
    }

    @PostMapping("input_done")
    public String input_done(@RequestParam("num") int num, Model model){
        String result="";
        for(int i=1;i<=9;i++) {
            result +=num+"x"+i+"="+num*i+"\r\n";
        }
        model.addAttribute("result",result);
        return "t_result";

    }
}
