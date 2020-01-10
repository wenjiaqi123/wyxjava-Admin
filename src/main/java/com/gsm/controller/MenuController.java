package com.gsm.controller;

import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("菜单模块")
@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @ApiOperation("获取菜单列表")
    @GetMapping("/menuList")
    public ListVo selectMenuList(){
        ListVo listVo = menuService.selectMenuList();
        return listVo;
    }

    @ApiOperation("获取导航列表")
    @GetMapping("/menuNavList")
    public ListVo selectMenuNavList(){
        ListVo listVo = menuService.selectMenuNavList();
        return listVo;
    }
}
