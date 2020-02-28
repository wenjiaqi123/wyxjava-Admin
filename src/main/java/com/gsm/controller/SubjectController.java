package com.gsm.controller;

import com.gsm.pojo.database.SubjectDo;
import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.pojo.vo.vo.SubjectDetailsVo;
import com.gsm.pojo.vo.vo.SubjectVo;
import com.gsm.service.SubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("科目模块")
@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @ApiOperation("获取科目列表")
    @GetMapping("/subjectList")
    public ListVo selectSubjectList(SubjectVo subjectVo){
        ListVo listVo = subjectService.selectSubjectList(subjectVo);
        return listVo;
    }

    @ApiOperation("获取科目详细列表")
    @GetMapping("/subjectDetailsList")
    public ListVo selectSubjectDetailsList(SubjectVo subjectVo){
        ListVo listVo = subjectService.selectSubjectDetailsList(subjectVo);
        return listVo;
    }

    @ApiOperation("获取单个课程")
    @GetMapping("/subjectDetails/{id}")
    public SubjectDo selectSubjectDetailsById(@PathVariable Long id){
        SubjectDo subjectDo = subjectService.selectSubjectDetailsById(id);
        return subjectDo;
    }

    @ApiOperation("修改状态")
    @PutMapping("/subjectStatus")
    public BoolVo updateSubjectStatus(SubjectVo subjectVo){
        BoolVo boolVo = subjectService.updateSubjectStatus(subjectVo);
        return boolVo;
    }

    @ApiOperation("更新课程详情")
    @PutMapping("/subjectDetails")
    public BoolVo updateSubjectDetailsById(SubjectDetailsVo subjectDetailsVo){
        BoolVo boolVo = subjectService.updateSubjectDetailsById(subjectDetailsVo);
        return boolVo;
    }
}
