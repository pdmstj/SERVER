package kr.hs.study.myBatisPrj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
    @GetMapping("/login")
    public String login_input(){
        return "login";
    }
    @PostMapping("login_result")
    public String login_result(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {
        System.out.println("id:"+id);
        System.out.println("pass"+pw);
        String result="";
        if(id.equals("kim")&& pw.equals("1111")) {
            result="welcome Kim";
        }else {
            result="wrong";
        }
        model.addAttribute("result",result);
        return "login_result";
    }
}
