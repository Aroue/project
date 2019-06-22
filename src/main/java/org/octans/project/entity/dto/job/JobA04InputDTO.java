package org.octans.project.entity.dto.job;

import io.swagger.annotations.ApiModelProperty;
import org.octans.project.util.dto.RequestDTO;

import javax.validation.constraints.NotNull;


public class JobA04InputDTO extends RequestDTO {
    @NotNull(message = "id不能为空")
    private Integer id;

    @ApiModelProperty(value = "职位id", name = "id", dataType = "Integer")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
