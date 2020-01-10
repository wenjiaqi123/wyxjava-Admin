package com.gsm.pojo.vo.baseVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("List型返回")
public class ListVo {
    @ApiModelProperty("total")
    private Long total;
    @ApiModelProperty("list")
    private List list;
    @ApiModelProperty("对list描述")
    private String msg;
}
