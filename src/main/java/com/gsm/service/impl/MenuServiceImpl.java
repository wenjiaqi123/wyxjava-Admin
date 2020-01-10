package com.gsm.service.impl;

import com.gsm.dao.MenuDao;
import com.gsm.pojo.database.MenuDo;
import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.service.MenuService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuDao menuDao;

    @Override
    public ListVo selectMenuList() {
        List<MenuDo> menuList = menuDao.selectMenuList();
        ListVo listVo = ListVo.builder()
                .list(menuList)
                .msg("菜单列表")
                .build();
        return listVo;
    }

    @Override
    public ListVo selectMenuNavList() {
        //导航列表菜单
        Integer id = 3;
        List<MenuDo> navList = menuDao.selectMenuNavList(id);
        ListVo listVo = ListVo.builder()
                .list(navList)
                .msg("菜单导航列表")
                .build();
        return listVo;
    }
}
