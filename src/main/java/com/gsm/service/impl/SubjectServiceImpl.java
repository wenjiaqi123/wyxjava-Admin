package com.gsm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gsm.dao.SubjectDao;
import com.gsm.pojo.database.SubjectDo;
import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.pojo.vo.vo.SubjectVo;
import com.gsm.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectDao subjectDao;

    @Override
    public ListVo selectSubjectList(SubjectVo subjectVo) {
        PageHelper.startPage(subjectVo.getPage(), subjectVo.getRows());
        List<SubjectDo> subjectDoList = subjectDao.selectSubjectList(subjectVo);
        PageInfo<SubjectDo> list = new PageInfo<>(subjectDoList);
        ListVo listVo = ListVo.builder()
                .total(list.getTotal())
                .list(subjectDoList)
                .msg("科目列表")
                .build();
        return listVo;
    }


    @Override
    public ListVo selectSubjectDetailsList(SubjectVo subjectVo) {
        PageHelper.startPage(subjectVo.getPage(), subjectVo.getRows());
        List<SubjectDo> subjectDoList = subjectDao.selectSubjectDetailsList(subjectVo);
        PageInfo<SubjectDo> list = new PageInfo<>(subjectDoList);
        ListVo listVo = ListVo.builder()
                .total(list.getTotal())
                .list(subjectDoList)
                .msg("科目列表")
                .build();
        return listVo;
    }

    @Override
    public SubjectDo selectSubjectDetailsById(Long id) {
        SubjectDo subjectDo = subjectDao.selectSubjectDetailsById(id);
        return subjectDo;
    }

    @Override
    public BoolVo updateSubjectStatus(SubjectVo subjectVo) {
        subjectDao.updateSubjectStatus(subjectVo);
        BoolVo boolVo = new BoolVo(true,"修改成功");
        return boolVo;
    }

}
