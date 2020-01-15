package com.gsm.dao;

import com.gsm.pojo.database.SubjectDo;
import com.gsm.pojo.vo.vo.SubjectVo;

import java.util.List;

public interface SubjectDao {
    List<SubjectDo> selectSubjectList(SubjectVo subjectVo);

    List<SubjectDo> selectSubjectDetailsList(SubjectVo subjectVo);

    void updateSubjectStatus(SubjectVo subjectVo);

    SubjectDo selectSubjectDetailsById(Long id);
}
