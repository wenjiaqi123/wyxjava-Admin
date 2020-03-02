package com.gsm.pojo.vo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("课程细节信息")
public class CourseDetailsVo {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("课程id")
    private Long courseId;
    @ApiModelProperty("课程视频Url")
    private String courseUrl;
    @ApiModelProperty("课程时长")
    private Integer courseTime;
    @ApiModelProperty("课程大小")
    private Integer courseSize;
    @ApiModelProperty("课程评分")
    private Double courseScore;
    @ApiModelProperty("状态")
    private Integer status;

    private List<CourseDataVo> courseDataVos;
}
