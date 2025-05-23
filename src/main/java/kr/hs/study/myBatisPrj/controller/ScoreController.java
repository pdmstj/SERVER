package kr.hs.study.myBatisPrj.controller;

import kr.hs.study.myBatisPrj.dto.ScoreDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class scoreController {
    @GetMapping("/score")
    public String score_input(){
        return "score_input";
    }
   @PostMapping("score_result")
    public String score_result(ScoreDTO dto, Model model) {
        dto.setTotal(dto.getKor()+dto.getEng()+dto.getMath());
        String avg=String.format("%.2f",dto.getTotal()/3.0);
        dto.setAvg(Double.parseDouble(avg));
        model.addAttribute("dto",dto);
        return "score_result";

   }
}
