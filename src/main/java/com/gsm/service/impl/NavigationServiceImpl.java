package com.gsm.service.impl;

import com.gsm.dao.NavigationDao;
import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.pojo.vo.vo.NavInfoVo;
import com.gsm.service.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NavigationServiceImpl implements NavigationService {
    @Autowired
    private NavigationDao navigationDao;

    @Override
    public NavInfoVo selectNavInfo(NavInfoVo navInfoVo) {
        NavInfoVo navInfo = navigationDao.selectNavInfo(navInfoVo);
        return navInfo;
    }

    @Override
    public BoolVo updateNavInfo(NavInfoVo navInfoVo) {
        navigationDao.updateNavInfo(navInfoVo);
        BoolVo boolVo = new BoolVo(true, "修改成功");
        return boolVo;
    }
}
