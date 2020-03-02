package com.gsm.service;

import com.gsm.pojo.database.CourseDetailsDo;
import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.pojo.vo.vo.CourseDataVo;
import com.gsm.pojo.vo.vo.CourseDetailsVo;
import com.gsm.pojo.vo.vo.CourseVo;

import java.util.List;

public interface CourseService {
    ListVo selectCourseList(CourseVo courseVo);

    BoolVo updateCourseStatus(CourseVo courseVo);

    ListVo selectCourseDataList(CourseDataVo courseDataVo);

    CourseDetailsDo selectCourseDetails(CourseDetailsVo courseDetailsVo);

    BoolVo updateCourseDetails(CourseDetailsVo courseDetailsVo);

    BoolVo updateCourseDataList(Long courseId, List<CourseDataVo> list);

    BoolVo insertCourseDetailsAndData(CourseVo courseVo, CourseDetailsVo vo);
}
