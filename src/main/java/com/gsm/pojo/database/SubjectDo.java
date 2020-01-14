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
@ApiModel("科目信息")
public class SubjectDo{
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("科目名称")
    private String subjectName;
    @ApiModelProperty("状态")
    private Integer status;

    @ApiModelProperty("科目细节")
    private SubjectDetailsDo subjectDetailsDo;
}
