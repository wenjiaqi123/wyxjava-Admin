package com.gsm.service;

import com.gsm.pojo.vo.baseVo.ListVo;

public interface MenuService {
    ListVo selectMenuList();

    ListVo selectMenuNavList();
}
