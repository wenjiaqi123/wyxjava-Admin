package com.gsm.controller;

import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.pojo.vo.baseVo.ListVo;
import com.gsm.pojo.vo.vo.SuggestionVo;
import com.gsm.service.SuggestionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("建议反馈")
@RestController
@RequestMapping("/suggest")
public class SuggestionController {
    @Autowired
    private SuggestionService suggestionService;

    @ApiOperation("提交反馈")
    @PostMapping("/suggestion")
    public BoolVo insertSuggestion(SuggestionVo suggestionVo){
        BoolVo boolVo = suggestionService.insertSuggestion(suggestionVo);
        return boolVo;
    }

    @ApiOperation("查询反馈建议")
    @GetMapping("/suggestion")
    public ListVo selectSuggestion(SuggestionVo suggestionVo){
        ListVo listVo = suggestionService.selectSuggestion(suggestionVo);
        return listVo;
    }
}
