package org.octans.project.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import org.octans.project.util.dto.RequestDTO;

import javax.validation.constraints.NotNull;

public class deleteInputDTO extends RequestDTO {

    @NotNull(message = "ID不能为空")
    private Integer[] ids;

    @ApiModelProperty(value = "用户ID", name = "id", dataType = "Integer[]")
    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }
}
