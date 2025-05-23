package kr.hs.study.myBatisPrj.service;

import kr.hs.study.myBatisPrj.dto.TodoDTO;
import java.util.List;

public interface TodoService {
    List<TodoDTO> getAllTodos();
    void addTodo(TodoDTO dto);
    void deleteTodo(Long id);
    void updateTodo(TodoDTO dto);
    TodoDTO getTodoById(Long id);
}
