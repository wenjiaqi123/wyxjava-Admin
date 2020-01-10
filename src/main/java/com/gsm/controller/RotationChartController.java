package com.gsm.controller;

import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.pojo.vo.vo.RotationChartVo;
import com.gsm.service.MenuService;
import com.gsm.service.RotationChartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
