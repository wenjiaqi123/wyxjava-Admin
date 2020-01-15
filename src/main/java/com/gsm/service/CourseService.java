package com.gsm.service;

import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.pojo.vo.vo.CourseVo;

public interface CourseService {
    ListVo selectCourseList(CourseVo courseVo);
}
