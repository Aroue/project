package org.octans.project.entity.dto.dept;

import io.swagger.annotations.ApiModelProperty;
import org.octans.project.util.dto.RequestDTO;

import javax.validation.constraints.NotNull;


public class DeptA03InputDTO extends RequestDTO {
    @NotNull(message = "id不能为空")
    private Integer id;

    @NotNull(message = "部门名称不能为空")
    private String name;

    @NotNull(message = "详细信息不能为空")
    private String remark;

    @ApiModelProperty(value = "部门名称", name = "name", dataType = "String")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ApiModelProperty(value = "部门详细信息", name = "remark", dataType = "String")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @ApiModelProperty(value = "部门id", name = "id", dataType = "Integer")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
