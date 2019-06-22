package org.octans.project.entity.dto.employee;

import io.swagger.annotations.ApiModelProperty;
import org.octans.project.util.dto.RequestDTO;


public class EmployeeA01InputDTO extends RequestDTO {

    /**
     * 部门ID
     */
    private Integer deptId;

    /**
     * 职位ID
     */
    private Integer jobId;

    /**
     * 身份证号码
     */
    private String cardId;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 员工姓名
     */
    private String name;

    @ApiModelProperty(value = "员工名称", name = "name", dataType = "String")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ApiModelProperty(value = "部门ID", name = "deptId", dataType = "Integer")
    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @ApiModelProperty(value = "职位ID", name = "jobId", dataType = "Integer")
    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    @ApiModelProperty(value = "身份证号码", name = "cardId", dataType = "String")
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @ApiModelProperty(value = "性别", name = "sex", dataType = "Integer")
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @ApiModelProperty(value = "手机号码", name = "phone", dataType = "String")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
