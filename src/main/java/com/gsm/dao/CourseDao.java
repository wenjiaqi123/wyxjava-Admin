package com.gsm.dao;

import com.gsm.pojo.database.CourseDataDo;
import com.gsm.pojo.database.CourseDetailsDo;
import com.gsm.pojo.database.CourseDo;
import com.gsm.pojo.vo.vo.CourseDataVo;
import com.gsm.pojo.vo.vo.CourseDetailsVo;
import com.gsm.pojo.vo.vo.CourseVo;

import java.util.List;

public interface CourseDao {
    List<CourseDo> selectCourseList(CourseVo courseVo);

    void updateCourseStatus(CourseVo courseVo);

    List<CourseDataDo> selectCourseDataList(CourseDataVo courseDataVo);

    CourseDetailsDo selectCourseDetails(CourseDetailsVo courseDetailsVo);
}
