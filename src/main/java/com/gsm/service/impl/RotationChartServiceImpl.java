package com.gsm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gsm.dao.RotationChartDao;
import com.gsm.pojo.database.RotationChartDo;
import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.pojo.vo.vo.RotationChartVo;
import com.gsm.service.RotationChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RotationChartServiceImpl implements RotationChartService {
    @Autowired
    private RotationChartDao rotationChartDao;

    @Override
    public ListVo selectRotationChartList(RotationChartVo chartVo) {
        PageHelper.startPage(chartVo.getPage(), chartVo.getRows());
        List<RotationChartDo> chartDoList = rotationChartDao.selectRotationChartList(chartVo);
        PageInfo<RotationChartDo> list = new PageInfo<>(chartDoList);
        ListVo listVo = ListVo.builder()
                .total(list.getTotal())
                .list(chartDoList)
                .msg("轮播图列表")
                .build();
        return listVo;
    }

    @Override
    public BoolVo updateRotationChartById(RotationChartVo chartVo) {
        rotationChartDao.updateRotationChartById(chartVo);
        BoolVo boolVo = new BoolVo(true,"保存成功");
        return boolVo;
    }
}
