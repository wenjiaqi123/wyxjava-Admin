package com.gsm.dao;

import com.gsm.pojo.vo.vo.NavInfoVo;

public interface NavigationDao {
    NavInfoVo selectNavInfo(NavInfoVo navInfoVo);

    void updateNavInfo(NavInfoVo navInfoVo);
}
