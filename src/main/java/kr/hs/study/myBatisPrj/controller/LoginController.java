package kr.hs.study.myBatisPrj.controller;

import kr.hs.study.myBatisPrj.dto.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("login", new LoginDTO());
        return "login";
    }

    @PostMapping("/login")
    public String loginResult(@ModelAttribute("login") LoginDTO login, Model model) {

        if ("user".equals(login.getUsername()) && "1234".equals(login.getPassword())) {
            model.addAttribute("message", "로그인 성공!");
            return "login_success";
        } else {
            model.addAttribute("message", "아이디 또는 비밀번호가 올바르지 않습니다.");
            return "login_form";
        }
    }
}
