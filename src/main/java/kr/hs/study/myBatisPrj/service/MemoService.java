package kr.hs.study.myBatisPrj.service;

import kr.hs.study.myBatisPrj.dto.memoDTO;

import java.util.List;

public interface memoService {
    public void insert(memoDTO dto);
    public List<memoDTO> list();
    public memoDTO listOne(int idx);
    public void update(memoDTO dto);
    public void delete(int idx);
}
