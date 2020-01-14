package com.gsm.pojo.vo.vo;

import com.gsm.pojo.BaseQuery;
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
@ApiModel("科目信息")
public class SubjectVo extends BaseQuery {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("科目名称")
    private String subjectName;
    @ApiModelProperty("状态")
    private Integer status;
}
