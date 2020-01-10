package com.gsm.pojo.vo.baseVo;

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
@ApiModel("用户信息")
public class UserInfo {
    @ApiModelProperty("主键id")
    private Long id;
    @ApiModelProperty("用户名")
    private String userName;
    @ApiModelProperty("用户昵称")
    private String userNickName;
    @ApiModelProperty("手机号")
    private String iphoneNo;
    @ApiModelProperty("邮箱")
    private String userEmail;
    @ApiModelProperty("头像")
    private String headPortrait;
}
