package com.gsm.pojo.database;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("反馈信息")
public class SuggestionDo {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("反馈类型")
    private Integer suggestType;
    @ApiModelProperty("反馈描述")
    private String suggestDesc;
    @ApiModelProperty("手机号")
    private String iphoneNo;
    @ApiModelProperty("邮箱号")
    private String email;
    @ApiModelProperty("状态")
    private Integer status;
}
