package com.gsm.controller;

import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.pojo.vo.vo.CourseDataVo;
import com.gsm.pojo.vo.vo.CourseVo;
import com.gsm.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @ApiOperation("获取课程列表")
    @PutMapping("/courseStatus")
    public BoolVo updateCourseStatus(CourseVo courseVo){
        BoolVo boolVo = courseService.updateCourseStatus(courseVo);
        return boolVo;
    }

    @ApiOperation("获取课程资料")
    @GetMapping("/courseDataList")
    public ListVo selectCourseDataList(CourseDataVo courseDataVo){
        ListVo listVo = courseService.selectCourseDataList(courseDataVo);
        return listVo;
    }
}
