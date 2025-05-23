package kr.hs.study.myBatisPrj.service;

import kr.hs.study.myBatisPrj.dao.MemoDAO;
import kr.hs.study.myBatisPrj.dto.memoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class memoServiceImpl implements memoService{
    @Autowired
    private MemoDAO dao;

    @Override
    public void insert(memoDTO dto) {
        dao.insert(dto);

    }

    @Override
    public List<memoDTO> list() {
     return dao.list();
    }

    @Override
    public memoDTO listOne(int idx) {
        return dao.listOne(idx);
    }

    @Override
    public void update(memoDTO dto) {
        System.out.println("writer:"+dto.getWriter());
        System.out.println("writer:"+dto.getMemo());
        dao.update(dto);
    }

    @Override
    public void delete(int idx) {
        dao.delete(idx);
    }
}
