package com.gsm.dao;

import com.gsm.pojo.database.MenuDo;

import java.util.List;

public interface MenuDao {
    List selectMenuList();

    List<MenuDo> selectMenuNavList(Integer id);
}
