package com.gsm.service.impl;

import com.gsm.dao.SuggestionDao;
import com.gsm.pojo.database.SuggestionDo;
import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.pojo.vo.vo.SuggestionVo;
import com.gsm.service.SuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuggestionServiceImpl implements SuggestionService {
    @Autowired
    private SuggestionDao suggestionDao;

    @Override
    public BoolVo insertSuggestion(SuggestionVo suggestionVo) {
        suggestionDao.insertSuggestion(suggestionVo);
        BoolVo boolVo = new BoolVo(true, "反馈成功");
        return boolVo;
    }

    @Override
    public ListVo selectSuggestion(SuggestionVo suggestionVo) {
        List<SuggestionDo> doList = suggestionDao.selectSuggestion(suggestionVo);
        ListVo listVo = ListVo.builder()
                .list(doList)
                .msg("反馈建议列表")
                .build();
        return listVo;
    }

    @Override
    public BoolVo updateSuggestion(SuggestionVo suggestionVo) {
        suggestionDao.updateSuggestion(suggestionVo);
        BoolVo boolVo = new BoolVo(true, "修改成功");
        return boolVo;
    }
}
