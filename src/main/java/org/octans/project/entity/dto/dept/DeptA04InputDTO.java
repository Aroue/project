package org.octans.project.entity.dto.dept;

import io.swagger.annotations.ApiModelProperty;
import org.octans.project.util.dto.RequestDTO;

import javax.validation.constraints.NotNull;


public class DeptA04InputDTO extends RequestDTO {
    @NotNull(message = "id不能为空")
    private Integer id;

    @ApiModelProperty(value = "部门id", name = "id", dataType = "Integer")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
