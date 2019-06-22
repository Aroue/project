package org.octans.project.entity.dto.job;

import io.swagger.annotations.ApiModelProperty;
import org.octans.project.util.dto.RequestDTO;


public class JobA01InputDTO extends RequestDTO {

    private String name;

    @ApiModelProperty(value = "职位名称", name = "name", dataType = "String")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
