package com.gsm.service.impl;

import com.gsm.dao.CourseDao;
import com.gsm.pojo.database.CourseDataDo;
import com.gsm.pojo.database.CourseDetailsDo;
import com.gsm.pojo.database.CourseDo;
import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.pojo.vo.vo.CourseDataVo;
import com.gsm.pojo.vo.vo.CourseVo;
import com.gsm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDao courseDao;

    @Override
    public ListVo selectCourseList(CourseVo courseVo) {
        List<CourseDo> courseDoList = courseDao.selectCourseList(courseVo);
        courseDoList.forEach(i -> {
            if (i.getCourseDetailsDo() == null) {
                i.setCourseDetailsDo(new CourseDetailsDo());
            }
        });
        ListVo listVo = ListVo.builder()
                .list(courseDoList)
                .msg("课程列表")
                .build();
        return listVo;
    }

    @Override
    public BoolVo updateCourseStatus(CourseVo courseVo) {
        courseDao.updateCourseStatus(courseVo);
        BoolVo boolVo = new BoolVo(true, "修改成功");
        return boolVo;
    }

    @Override
    public ListVo selectCourseDataList(CourseDataVo courseDataVo) {
        List<CourseDataDo> courseDoList = courseDao.selectCourseDataList(courseDataVo);
        ListVo listVo = ListVo.builder()
                .list(courseDoList)
                .msg("课程资料列表")
                .build();
        return listVo;
    }
}
