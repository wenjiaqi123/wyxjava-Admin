package com.gsm.controller;

import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.pojo.vo.vo.RotationChartVo;
import com.gsm.service.RotationChartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("轮播图模块")
@RestController
@RequestMapping("/rotationChart")
public class RotationChartController {
    @Autowired
    private RotationChartService rotationChartService;

    @ApiOperation("获取轮播图列表")
    @GetMapping("/chartList")
    public ListVo selectRotationChartList(RotationChartVo chartVo){
        ListVo listVo = rotationChartService.selectRotationChartList(chartVo);
        return listVo;
    }

    @ApiOperation("修改单个轮播图信息")
    @PutMapping("/chart")
    public BoolVo updateRotationChartById(RotationChartVo chartVo){
        BoolVo boolVo = rotationChartService.updateRotationChartById(chartVo);
        return boolVo;
    }

    @ApiOperation("新增单个轮播图信息")
    @PostMapping("/chart")
    public BoolVo insertRotationChart(RotationChartVo chartVo){
        BoolVo boolVo = rotationChartService.insertRotationChart(chartVo);
        return boolVo;
    }
}
