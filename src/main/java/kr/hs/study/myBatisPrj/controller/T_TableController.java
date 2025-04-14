package kr.hs.study.myBatisPrj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class T_TableController {

    @GetMapping("/Times_Table")
    public String ttable() {
        return "table_input";
    }

    @PostMapping("/Times_Table")
    public String ttableResult(@RequestParam("dan") int dan, Model model) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            result.add(dan + " x " + i + " = " + (dan * i));
        }

        model.addAttribute("list", result);
        model.addAttribute("dan", dan);
        return "result";
    }

}
