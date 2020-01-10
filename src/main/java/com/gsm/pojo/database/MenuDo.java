package com.gsm.pojo.database;

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
@ApiModel("菜单信息")
public class MenuDo {
    @ApiModelProperty("菜单id")
    private Long id;
    @ApiModelProperty("菜单名称")
    private String menuName;
    @ApiModelProperty("菜单编号")
    private String menuCode;
    @ApiModelProperty("菜单父id")
    private Long menuPid;
    @ApiModelProperty("显示顺序")
    private Integer showOrder;

    @ApiModelProperty("子菜单")
    private List<MenuDo> list;
}
