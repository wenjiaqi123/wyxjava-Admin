package com.gsm.dao;

import com.gsm.pojo.database.CourseDataDo;
import com.gsm.pojo.database.CourseDetailsDo;
import com.gsm.pojo.database.CourseDo;
import com.gsm.pojo.vo.vo.CourseDataVo;
import com.gsm.pojo.vo.vo.CourseDetailsVo;
import com.gsm.pojo.vo.vo.CourseVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseDao {
    List<CourseDo> selectCourseList(CourseVo courseVo);

    void updateCourseStatus(CourseVo courseVo);

    List<CourseDataDo> selectCourseDataList(CourseDataVo courseDataVo);

    CourseDetailsDo selectCourseDetails(CourseDetailsVo courseDetailsVo);

    void deleteCourseDataListByCourseId(Long courseId);
    void insertCourseDataList(List<CourseDataVo> list);

    void updateCourseDetails(CourseDetailsVo courseDetailsVo);

    void insertCourseBySubjectId(CourseVo courseVo);

    void insertCourseDetailsByCourseId(CourseDetailsVo courseVo);

    void insertCourseDataByCourseId(List<CourseDataVo> courseDataVos);
}
