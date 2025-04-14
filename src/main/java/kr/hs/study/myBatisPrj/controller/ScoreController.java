package kr.hs.study.myBatisPrj.controller;

import kr.hs.study.myBatisPrj.dto.ScoreDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ScoreController {

    @GetMapping("/score")
    public String scoreForm(Model model) {
        model.addAttribute("score", new ScoreDTO());
        return "score_input"; // 점수 입력 폼 (score_input.html)
    }

    @PostMapping("/score")
    public String scoreResult(@ModelAttribute("score") ScoreDTO score, Model model) {
        int total = score.getKor() + score.getEng() + score.getMath();
        double avg = total / 3.0;

        model.addAttribute("total", total);
        model.addAttribute("avg", avg);
        return "score_result";
    }
}
