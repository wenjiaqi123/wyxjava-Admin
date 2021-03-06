package com.gsm.dao;

import com.gsm.pojo.database.SubjectDo;
import com.gsm.pojo.vo.vo.SubjectDetailsVo;
import com.gsm.pojo.vo.vo.SubjectVo;

import java.util.List;

public interface SubjectDao {
    List<SubjectDo> selectSubjectList(SubjectVo subjectVo);

    List<SubjectDo> selectSubjectDetailsList(SubjectVo subjectVo);

    void updateSubjectStatus(SubjectVo subjectVo);

    SubjectDo selectSubjectDetailsById(Long id);

    void updateSubjectDetailsById(SubjectDetailsVo subjectDetailsVo);

    void updateSubjectById(SubjectVo subjectVo);

    void insertSubject(SubjectVo subjectVo);

    void insertSubjectDetails(SubjectDetailsVo subjectDetailsVo);
}
