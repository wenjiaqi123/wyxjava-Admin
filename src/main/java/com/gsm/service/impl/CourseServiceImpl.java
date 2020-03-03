package com.gsm.service.impl;

import com.gsm.dao.CourseDao;
import com.gsm.pojo.database.CourseDataDo;
import com.gsm.pojo.database.CourseDetailsDo;
import com.gsm.pojo.database.CourseDo;
import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.pojo.vo.vo.CourseDataVo;
import com.gsm.pojo.vo.vo.CourseDetailsVo;
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

    @Override
    public CourseDetailsDo selectCourseDetails(CourseDetailsVo courseDetailsVo) {
        CourseDetailsDo courseDetailsDo = courseDao.selectCourseDetails(courseDetailsVo);
        return courseDetailsDo;
    }

    @Override
    public BoolVo updateCourseDetails(CourseDetailsVo courseDetailsVo) {
        courseDao.updateCourseDetails(courseDetailsVo);
        BoolVo boolVo = new BoolVo(true, "修改成功");
        return boolVo;
    }

    @Override
    public BoolVo updateCourseDataList(Long courseId, List<CourseDataVo> list) {
        courseDao.deleteCourseDataListByCourseId(courseId);
        courseDao.insertCourseDataList(list);
        BoolVo boolVo = new BoolVo(true, "修改成功");
        return boolVo;
    }

    @Override
    public BoolVo insertCourseDetailsAndData(CourseVo courseVo, CourseDetailsVo courseDetailsVo) {
        //根据科目id添加新课程
        courseDao.insertCourseBySubjectId(courseVo);
        //获取新增的课程id
        Long courseVoId = courseVo.getId();
        courseDetailsVo.setCourseId(courseVoId);
        //根据课程id添加课程详细信息
        courseDao.insertCourseDetailsByCourseId(courseDetailsVo);
        List<CourseDataVo> courseDataVos = courseDetailsVo.getCourseDataVos();
        if (courseDataVos != null && courseDataVos.size() > 0) {
            courseDataVos.forEach(i -> {
                i.setCourseId(courseVoId);
            });
            //根据课程id添加课程资料
            courseDao.insertCourseDataByCourseId(courseDataVos);
        }
        BoolVo boolVo = new BoolVo(true, "保存成功");
        return boolVo;
    }

    @Override
    public CourseDo selectCourse(Long id) {
        CourseDo courseDo = courseDao.selectCourse(id);
        return courseDo;
    }

    @Override
    public BoolVo updateCourse(CourseVo courseVo) {
        courseDao.updateCourse(courseVo);
        BoolVo boolVo = new BoolVo(true, "修改成功");
        return boolVo;
    }
}
