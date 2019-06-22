package org.octans.project.entity.dto.user;

import io.swagger.annotations.ApiModelProperty;
import org.octans.project.util.dto.RequestDTO;

import javax.validation.constraints.NotNull;

public class UserA04InputDTO extends RequestDTO {

    @NotNull(message = "id不能为空")
    private Integer id;

    @NotNull(message = "登录名不能为空")
    private String loginName;

    @NotNull(message = "用户名不能为空")
    private String userName;

    @NotNull(message = "权限状态不能为空")
    private Integer status;

    @ApiModelProperty(value = "用户ID", name = "id", dataType = "Integer")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ApiModelProperty(value = "登录名", name = "loginName", dataType = "String")
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @ApiModelProperty(value = "用户名", name = "userName", dataType = "String")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @ApiModelProperty(value = "权限状态", name = "status", dataType = "Integer")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
