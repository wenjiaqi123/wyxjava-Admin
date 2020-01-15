package com.gsm.service.impl;

import com.gsm.dao.CourseDao;
import com.gsm.pojo.database.CourseDo;
import com.gsm.pojo.vo.baseVo.ListVo;
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
        long y = System.currentTimeMillis();
        ListVo listVo = ListVo.builder()
                .list(courseDoList)
                .msg("课程列表")
                .build();
        return listVo;
    }
}
