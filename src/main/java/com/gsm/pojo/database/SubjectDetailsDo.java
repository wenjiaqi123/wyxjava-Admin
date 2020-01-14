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
@ApiModel("科目细节信息")
public class SubjectDetailsDo {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("科目id")
    private Long subjectId;
    @ApiModelProperty("科目描述")
    private String subIntroduction;
    @ApiModelProperty("科目老师")
    private String subTeacher;
    @ApiModelProperty("qq群")
    private String qqGroup;
    @ApiModelProperty("科目封面图片")
    private String subPic;
    @ApiModelProperty("科目课程统计")
    private String subTotal;
    @ApiModelProperty("科目平均得分")
    private String subScore;
    @ApiModelProperty("状态")
    private Integer status;
}
