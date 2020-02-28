package com.gsm.pojo.vo.vo;

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
@ApiModel("课程信息")
public class CourseDataVo {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("课程id")
    private Long courseId;
    @ApiModelProperty("资料名称")
    private String dataName;
    @ApiModelProperty("资料Url")
    private String dataUrl;
    @ApiModelProperty("显示顺序")
    private Integer showOrder;
    @ApiModelProperty("状态")
    private Integer status;
}
