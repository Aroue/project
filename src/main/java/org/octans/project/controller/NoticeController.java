package org.octans.project.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.octans.project.entity.dto.notice.*;
import org.octans.project.entity.entity.Notice;
import org.octans.project.service.NoticeService;
import org.octans.project.util.BeanMapper;
import org.octans.project.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(tags = "noticeController | 公告相关API")
@RequestMapping("/notice")
public class NoticeController {
    private final NoticeService noticeService;

    @Autowired
    public NoticeController(NoticeService noticeService) {
        this.noticeService = noticeService;
    }


    @ApiOperation(value = "获取公告列表", notes = "获取公告列表（可根据公告名称内容搜索）", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/A01")
    public JSONResult A01(@Valid NoticeA01InputDTO input){
        JSONResult<List<NoticeA01DTO>> jsonResult = new JSONResult<>();
        List<NoticeA01DTO> deptList = BeanMapper.mapList(noticeService.getNoticeList(input.getTitle(),input.getContent()),NoticeA01DTO.class);
        // 设置返回数据
        jsonResult.setData(deptList);
        return jsonResult;
    }

    @ApiOperation(value = "添加公告", notes = "添加公告", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A02")
    public JSONResult A02(@Valid @RequestBody NoticeA02InputDTO input){
        JSONResult jsonResult = new JSONResult<>();

        Notice notice = BeanMapper.map(input,Notice.class);
        boolean success = noticeService.addNotice(notice);

        jsonResult.setMessage(success ? "添加成功" : "添加失败");
        return jsonResult;
    }

    @ApiOperation(value = "获取公告", notes = "获取公告详情", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A03")
    public JSONResult A03(@Valid @RequestBody NoticeA03InputDTO input){
        JSONResult<NoticeA01DTO> jsonResult = new JSONResult<>();

        NoticeA01DTO noticeA01DTO = BeanMapper.map(noticeService.getNotice(input.getId()),NoticeA01DTO.class);
        jsonResult.setData(noticeA01DTO);
        return jsonResult;
    }

    @ApiOperation(value = "编辑公告", notes = "编辑公告", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A04")
    public JSONResult A04(@Valid @RequestBody NoticeA04InputDTO input){
        JSONResult jsonResult = new JSONResult<>();

        Notice notice = BeanMapper.map(input,Notice.class);
        boolean success  =  noticeService.editNotice(notice);

        jsonResult.setMessage(success ? "编辑成功" : "编辑失败");
        return jsonResult;
    }

    @ApiOperation(value = "删除公告", notes = "删除公告", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.POST, value = "/A05")
    public JSONResult A05(@Valid @RequestBody NoticeA03InputDTO input){
        JSONResult jsonResult = new JSONResult<>();

        boolean success  =  noticeService.deleteNotice(input.getId());

        jsonResult.setMessage(success ? "删除成功" : "删除失败");
        return jsonResult;
    }
}
