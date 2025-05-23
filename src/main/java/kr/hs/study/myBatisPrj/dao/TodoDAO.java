package kr.hs.study.myBatisPrj.dao;

import kr.hs.study.myBatisPrj.dto.TodoDTO;
import java.util.List;

public interface TodoDAO {
    List<TodoDTO> getAllTodos();
    void insertTodo(TodoDTO dto);
    void deleteTodo(Long id);
    void updateTodo(TodoDTO dto);
    TodoDTO getTodoById(Long id);
}
