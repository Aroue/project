package org.octans.project.entity.dto.employee;

import io.swagger.annotations.ApiModelProperty;
import org.octans.project.util.dto.RequestDTO;

public class EmployeeA03InputDTO extends RequestDTO {
    private Integer id;

    @ApiModelProperty(value = "员工id", name = "id", dataType = "Integer")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
