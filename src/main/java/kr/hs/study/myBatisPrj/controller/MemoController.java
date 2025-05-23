package kr.hs.study.myBatisPrj.controller;

import kr.hs.study.myBatisPrj.dto.memoDTO;
import kr.hs.study.myBatisPrj.service.memoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class memoController {
    @Autowired
    memoService service;

    @GetMapping("/Memo")

    public String memo_input(Model model){
        List<memoDTO> dto=service.list();
        model.addAttribute("list",dto);
       return "memo_list";}

    @PostMapping("/write_done")
    public String memo_done(memoDTO dto) {
       service.insert(dto);
        return "redirect:/Memo";
    }

    @GetMapping("/edit/{idx}")
    public String listOne(@PathVariable ("idx") int idx, Model model) {
        memoDTO dto=service.listOne(idx);
        model.addAttribute("dto",dto);
        return "memo_edit";
    }
    @PostMapping("/update")
    public String update(memoDTO dto) {
        System.out.println("id:"+dto.getIdx());
        System.out.println("writer:"+dto.getWriter());
        System.out.println("writer:"+dto.getMemo());
        service.update(dto);
        return "redirect:/Memo";
    }
    @GetMapping("/delete/{idx}")
    public String delete(@PathVariable("idx") int idx) {
        service.delete(idx);
        return "redirect:/Memo";
    }


}

