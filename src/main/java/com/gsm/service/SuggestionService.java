package com.gsm.service;

import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.pojo.vo.vo.SuggestionVo;

public interface SuggestionService {
    BoolVo insertSuggestion(SuggestionVo suggestionVo);

    ListVo selectSuggestion(SuggestionVo suggestionVo);

    BoolVo updateSuggestion(SuggestionVo suggestionVo);
}
