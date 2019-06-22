package org.octans.project.entity.dto.dept;

import io.swagger.annotations.ApiModelProperty;
import org.octans.project.util.dto.RequestDTO;


public class DeptA01InputDTO extends RequestDTO {

    private String name;

    @ApiModelProperty(value = "部门名称", name = "name", dataType = "String")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
