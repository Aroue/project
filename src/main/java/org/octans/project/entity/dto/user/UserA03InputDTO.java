package org.octans.project.entity.dto.user;

import io.swagger.annotations.ApiModelProperty;
import org.octans.project.util.dto.RequestDTO;

import javax.validation.constraints.NotNull;

public class UserA03InputDTO extends RequestDTO {

    @NotNull(message = "ID不能为空")
    private Integer id;

    @ApiModelProperty(value = "用户ID", name = "id", dataType = "Integer")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
