package kr.hs.study.myBatisPrj.controller;

import kr.hs.study.myBatisPrj.dto.TodoDTO;
import kr.hs.study.myBatisPrj.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @GetMapping("/todo")
    public String todoPage(Model model) {
        model.addAttribute("list", service.getAllTodos());
        model.addAttribute("newTodo", new TodoDTO());
        return "todo";
    }

    @PostMapping("/todo/add")
    public String addTodo(@ModelAttribute("newTodo") TodoDTO dto) {
        service.addTodo(dto);
        return "redirect:/todo";
    }

    @GetMapping("/todo/delete/{id}")
    public String deleteTodo(@PathVariable Long id) {
        service.deleteTodo(id);
        return "redirect:/todo";
    }

    @GetMapping("/todo/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("todo", service.getTodoById(id));
        return "todo_edit";  // 수정용 html
    }

    @PostMapping("/todo/edit")
    public String editTodo(@ModelAttribute("todo") TodoDTO dto) {
        service.updateTodo(dto);
        return "redirect:/todo";
    }

}
