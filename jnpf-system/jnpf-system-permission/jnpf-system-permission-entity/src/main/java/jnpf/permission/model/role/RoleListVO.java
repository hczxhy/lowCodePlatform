package jnpf.permission.model.role;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RoleListVO {
    @ApiModelProperty(value = "主键")
    private String id;
    @ApiModelProperty(value = "名称")
    private String fullName;
    @ApiModelProperty(value = "编码")
    private String enCode;
    @ApiModelProperty(value = "角色类型")
    private String type;
    @ApiModelProperty(value = "备注")
    private String description;
    @ApiModelProperty(value = "状态")
    private Integer enabledMark;
    private Long creatorTime;
    @ApiModelProperty(value = "排序")
    private long sortCode;
}
