package com.gsm.dao;

import com.gsm.pojo.database.SuggestionDo;
import com.gsm.pojo.vo.vo.SuggestionVo;

import java.util.List;

public interface SuggestionDao {
    void insertSuggestion(SuggestionVo suggestionVo);

    List<SuggestionDo> selectSuggestion(SuggestionVo suggestionVo);

    void updateSuggestion(SuggestionVo suggestionVo);
}
