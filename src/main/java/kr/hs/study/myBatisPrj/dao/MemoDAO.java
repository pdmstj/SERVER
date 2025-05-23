package kr.hs.study.myBatisPrj.dao;

import kr.hs.study.myBatisPrj.dto.memoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MemoDAO {
    public void insert(memoDTO dto);
    public void update(memoDTO dto);
    public void delete(int idx);
    List<memoDTO> list();
    memoDTO listOne(int idx);
    public List<memoDTO> listAll();
    public memoDTO selectOne(int idx);
}
