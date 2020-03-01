package com.gsm.controller;

import com.gsm.pojo.database.CourseDetailsDo;
import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.pojo.vo.vo.CourseDataVo;
import com.gsm.pojo.vo.vo.CourseDetailsVo;
import com.gsm.pojo.vo.vo.CourseVo;
import com.gsm.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @ApiOperation("更新课程资料")
    @PostMapping("/courseDataList")
    public BoolVo updateCourseDataList(@RequestBody List<CourseDataVo> list){
        //BoolVo boolVo = courseService.updateCourseDataList(list);
        System.out.println(list);
        //return boolVo;
        return new BoolVo();
    }

    @ApiOperation("获取课程详细信息")
    @GetMapping("/courseDetails")
    public CourseDetailsDo selectCourseDetails(CourseDetailsVo courseDetailsVo){
        CourseDetailsDo courseDetailsDo = courseService.selectCourseDetails(courseDetailsVo);
        return courseDetailsDo;
    }

    @ApiOperation("更新课程详细信息")
    @PutMapping("/courseDetails")
    public BoolVo updateCourseDetails(CourseDetailsVo courseDetailsVo){
        BoolVo boolVo = courseService.updateCourseDetails(courseDetailsVo);
        System.out.println(courseDetailsVo);
        return boolVo;
    }
}
