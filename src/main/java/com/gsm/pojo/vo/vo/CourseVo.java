package com.gsm.pojo.vo.vo;

import com.gsm.pojo.database.CourseDetailsDo;
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
public class CourseVo {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("课程名称")
    private String courseName;
    @ApiModelProperty("科目id")
    private Integer subjectId;
    @ApiModelProperty("显示顺序")
    private String showOrder;
    @ApiModelProperty("状态")
    private Integer status;


    @ApiModelProperty("课程")
    private CourseDetailsDo courseDetailsDo;
}
