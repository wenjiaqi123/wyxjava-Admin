package com.gsm.service;

import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.pojo.vo.vo.SubjectVo;

public interface SubjectService {
    ListVo selectSubjectList(SubjectVo subjectVo);

    ListVo selectSubjectDetailsList(SubjectVo subjectVo);

    BoolVo updateSubjectStatus(SubjectVo subjectVo);
}
