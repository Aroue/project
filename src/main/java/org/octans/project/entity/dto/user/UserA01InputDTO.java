package org.octans.project.entity.dto.user;

import io.swagger.annotations.ApiModelProperty;
import org.octans.project.util.dto.RequestDTO;

import javax.validation.constraints.NotNull;

public class UserA01InputDTO extends RequestDTO {

    private String loginName;

    private Integer status;

    @ApiModelProperty(value = "登录名", name = "loginName", dataType = "String")
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @ApiModelProperty(value = "权限状态", name = "status", dataType = "Integer")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
