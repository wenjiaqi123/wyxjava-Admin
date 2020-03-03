package com.gsm.controller;

import com.gsm.pojo.database.CourseDetailsDo;
import com.gsm.pojo.database.CourseDo;
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

@Api("课程模块")
@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @ApiOperation("获取课程信息")
    @GetMapping("/course")
    public CourseDo selectCourse(Long id){
        CourseDo courseDo = courseService.selectCourse(id);
        return courseDo;
    }

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

    @ApiOperation("获取课程详细信息")
    @GetMapping("/courseDetails")
    public CourseDetailsDo selectCourseDetails(CourseDetailsVo courseDetailsVo){
        CourseDetailsDo courseDetailsDo = courseService.selectCourseDetails(courseDetailsVo);
        return courseDetailsDo;
    }

    @ApiOperation("更新课程详细信息")
    @PostMapping("/courseDetails")
    public BoolVo updateCourseDetails(CourseVo courseVo,CourseDetailsVo vo){
        courseVo.setId(vo.getCourseId());
        BoolVo b0 = courseService.updateCourse(courseVo);
        BoolVo b1 = courseService.updateCourseDetails(vo);
        BoolVo b2 = courseService.updateCourseDataList(vo.getCourseId(),vo.getCourseDataVos());
        if(b0.getFlag() && b1.getFlag() && b2.getFlag()){
            BoolVo boolVo = new BoolVo(true, "修改成功");
            return boolVo;
        }else {
            BoolVo boolVo = new BoolVo(false, "修改成功");
            return boolVo;
        }
    }

    @ApiOperation("保存课程信息和资料信息")
    @PostMapping("/courseDetailsAndData")
    public BoolVo insertCourseDetailsAndData(CourseVo courseVo,CourseDetailsVo courseDetailsVo){
        BoolVo boolVo = courseService.insertCourseDetailsAndData(courseVo,courseDetailsVo);
        return boolVo;
    }
}
