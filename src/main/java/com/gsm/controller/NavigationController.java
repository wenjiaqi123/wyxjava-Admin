package com.gsm.controller;

import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.pojo.vo.vo.NavInfoVo;
import com.gsm.service.NavigationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("导航模块")
@RestController
@RequestMapping("/navgation")
public class NavigationController {
    @Autowired
    private NavigationService navigationService;

    @ApiOperation("查询")
    @GetMapping("/navInfo")
    public NavInfoVo selectNavInfo(NavInfoVo navInfoVo){
        NavInfoVo navInfo = navigationService.selectNavInfo(navInfoVo);
        return navInfo;
    }

    @ApiOperation("修改")
    @PutMapping("/navInfo")
    public BoolVo updateNavInfo(NavInfoVo navInfoVo){
        BoolVo boolVo = navigationService.updateNavInfo(navInfoVo);
        return boolVo;
    }
}
