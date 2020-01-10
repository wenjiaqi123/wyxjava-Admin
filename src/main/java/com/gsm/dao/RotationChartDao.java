package com.gsm.dao;

import com.gsm.pojo.database.RotationChartDo;
import com.gsm.pojo.vo.vo.RotationChartVo;

import java.util.List;

public interface RotationChartDao {
    List<RotationChartDo> selectRotationChartList(RotationChartVo chartVo);
}
