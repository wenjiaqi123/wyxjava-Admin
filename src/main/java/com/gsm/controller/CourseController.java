package com.gsm.controller;

import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.pojo.vo.vo.CourseVo;
import com.gsm.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("课程模块")
@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @ApiOperation("获取课程列表")
    @GetMapping("/courseList")
    public ListVo selectCourseList(CourseVo courseVo){
        ListVo listVo = courseService.selectCourseList(courseVo);
        return listVo;
    }
}
