package org.octans.project.entity.dto.user;

import io.swagger.annotations.ApiModelProperty;
import org.octans.project.util.dto.RequestDTO;

public class UserA06InputDTO extends RequestDTO {

    private String loginName;

    private String password;

    @ApiModelProperty(value = "登录名", name = "loginName", dataType = "String")
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    @ApiModelProperty(value = "密码", name = "String", dataType = "String")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
