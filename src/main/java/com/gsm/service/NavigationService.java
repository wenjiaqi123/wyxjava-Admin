package com.gsm.service;

import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.pojo.vo.vo.NavInfoVo;

public interface NavigationService {
    NavInfoVo selectNavInfo(NavInfoVo navInfoVo);

    BoolVo updateNavInfo(NavInfoVo navInfoVo);
}
