package kr.hs.study.myBatisPrj.dao;

import kr.hs.study.myBatisPrj.dto.TodoDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class TodoDAOImpl implements TodoDAO {

    private final List<TodoDTO> db = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    @Override
    public List<TodoDTO> getAllTodos() {
        return db;
    }

    @Override
    public void insertTodo(TodoDTO dto) {
        dto.setId(idCounter.getAndIncrement());
        db.add(dto);
    }

    @Override
    public void deleteTodo(Long id) {
        db.removeIf(todo -> todo.getId().equals(id));
    }

    @Override
    public void updateTodo(TodoDTO dto) {
        for (TodoDTO t : db) {
            if (t.getId().equals(dto.getId())) {
                t.setTitle(dto.getTitle());
                t.setDone(dto.isDone());
                break;
            }
        }
    }

    @Override
    public TodoDTO getTodoById(Long id) {
        for (TodoDTO t : db) {
            if (t.getId().equals(id)) return t;
        }
        return null;
    }

}
