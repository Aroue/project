package org.octans.project.entity.dto.job;

import io.swagger.annotations.ApiModelProperty;
import org.octans.project.util.dto.RequestDTO;

import javax.validation.constraints.NotNull;


public class JobA03InputDTO extends RequestDTO {
    @NotNull(message = "id不能为空")
    private Integer id;

    @NotNull(message = "职位名称不能为空")
    private String name;

    @NotNull(message = "职位信息不能为空")
    private String remark;

    @ApiModelProperty(value = "职位名称", name = "name", dataType = "String")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ApiModelProperty(value = "职位详细信息", name = "remark", dataType = "String")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @ApiModelProperty(value = "职位id", name = "id", dataType = "Integer")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
