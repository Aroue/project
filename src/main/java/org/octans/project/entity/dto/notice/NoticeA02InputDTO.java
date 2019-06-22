package org.octans.project.entity.dto.notice;

import io.swagger.annotations.ApiModelProperty;
import org.octans.project.util.dto.RequestDTO;

import javax.validation.constraints.NotNull;


public class NoticeA02InputDTO extends RequestDTO {
    @NotNull(message = "用户ID不能为空")
    private Integer userId;

    @NotNull(message = "标题不能为空")
    private String title;

    @NotNull(message = "内容不能为空")
    private String content;

    @ApiModelProperty(value = "ID", name = "id", dataType = "Integer")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @ApiModelProperty(value = "标题", name = "title", dataType = "String")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ApiModelProperty(value = "内容", name = "content", dataType = "String")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
