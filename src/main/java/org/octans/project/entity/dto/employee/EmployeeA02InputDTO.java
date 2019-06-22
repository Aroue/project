package org.octans.project.entity.dto.employee;

import io.swagger.annotations.ApiModelProperty;
import org.octans.project.util.dto.RequestDTO;

import javax.validation.constraints.NotNull;
import java.util.Date;


public class EmployeeA02InputDTO extends RequestDTO {

    /**
     * 部门ID
     */
    @NotNull(message = "部门ID不能为空")
    private Integer deptId;

    /**
     * 职位ID
     */
    @NotNull(message = "职位ID不能为空")
    private Integer jobId;

    /**
     * 身份证号码
     */
    @NotNull(message = "身份证号码不能为空")
    private String cardId;

    /**
     * 员工姓名
     */
    @NotNull(message = "员工姓名不能为空")
    private String name;


    /**
     * 性别
     */
    private Integer sex;

    /**
     * 手机号码
     */
    private String phone;


    /**
     * 地址
     */
    private String address;

    /**
     * 邮编
     */
    private String postCode;

    /**
     * 电话
     */
    private String tel;

    /**
     * QQ号码
     */
    private String qqNum;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 政治面貌
     */
    private String parity;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 民族
     */
    private String race;

    /**
     * 学历
     */
    private String education;

    /**
     * 专业
     */
    private String speciality;

    /**
     * 特长
     */
    private String hobby;

    /**
     * 备注
     */
    private String remark;

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

    @ApiModelProperty(value = "地址", name = "address", dataType = "String")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @ApiModelProperty(value = "邮编", name = "postCode", dataType = "String")
    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @ApiModelProperty(value = "电话", name = "tel", dataType = "String")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @ApiModelProperty(value = "qq号码", name = "qqNum", dataType = "String")
    public String getQqNum() {
        return qqNum;
    }

    public void setQqNum(String qqNum) {
        this.qqNum = qqNum;
    }

    @ApiModelProperty(value = "邮箱", name = "email", dataType = "String")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @ApiModelProperty(value = "政治面貌", name = "parity", dataType = "String")
    public String getParity() {
        return parity;
    }

    public void setParity(String parity) {
        this.parity = parity;
    }

    @ApiModelProperty(value = "出生日期", name = "birthday", dataType = "Date")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @ApiModelProperty(value = "民族", name = "race", dataType = "String")
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @ApiModelProperty(value = "学历", name = "education", dataType = "String")
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @ApiModelProperty(value = "专业", name = "speciality", dataType = "String")
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @ApiModelProperty(value = "特长", name = "hobby", dataType = "String")
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @ApiModelProperty(value = "备注", name = "remark", dataType = "String")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
