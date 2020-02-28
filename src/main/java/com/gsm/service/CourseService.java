package com.gsm.service;

import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.pojo.vo.vo.CourseDataVo;
import com.gsm.pojo.vo.vo.CourseVo;

public interface CourseService {
    ListVo selectCourseList(CourseVo courseVo);

    BoolVo updateCourseStatus(CourseVo courseVo);

    ListVo selectCourseDataList(CourseDataVo courseDataVo);
}
