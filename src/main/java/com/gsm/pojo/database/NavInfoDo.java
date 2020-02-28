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
@ApiModel("导航信息")
public class NavInfoDo {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("导航模块id")
    private String navId;
    @ApiModelProperty("url")
    private String url;
    @ApiModelProperty("状态")
    private Integer status;
}
