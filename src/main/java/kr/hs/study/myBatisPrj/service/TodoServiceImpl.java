package kr.hs.study.myBatisPrj.service;

import kr.hs.study.myBatisPrj.dao.TodoDAO;
import kr.hs.study.myBatisPrj.dto.TodoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    private final TodoDAO dao;

    public TodoServiceImpl(TodoDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<TodoDTO> getAllTodos() {
        return dao.getAllTodos();
    }

    @Override
    public void addTodo(TodoDTO dto) {
        dao.insertTodo(dto);
    }

    @Override
    public void deleteTodo(Long id) {
        dao.deleteTodo(id);
    }

    @Override
    public void updateTodo(TodoDTO dto) {
        dao.updateTodo(dto);
    }

    @Override
    public TodoDTO getTodoById(Long id) {
        return dao.getTodoById(id);
    }

}
