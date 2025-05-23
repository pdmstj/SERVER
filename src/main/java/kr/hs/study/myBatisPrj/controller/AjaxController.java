package kr.hs.study.myBatisPrj.controller;

import kr.hs.study.myBatisPrj.dto.productDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
    @GetMapping("/ajax")
    public String ajax(){
        return "ajax";
    }

    @ResponseBody
    @GetMapping("/background")
    public productDTO background(){
        productDTO dto=new productDTO("pen",1000);
        return dto;
    }
}
