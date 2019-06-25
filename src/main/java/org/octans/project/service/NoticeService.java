package org.octans.project.service;

import org.octans.project.entity.dto.notice.NoticeA01DTO;
import org.octans.project.entity.entity.Notice;

import java.util.List;

public interface NoticeService {
    /**
     * 获取公告列表
     * @param title
     * @param content
     * @return
     */
    List<NoticeA01DTO> getNoticeList(String title,String content,int offset, int page_size);

    /**
     * 获取公告总数
     * @param title
     * @param content
     * @return
     */
    int getNoticeListCount(String title,String content);

    /**
     * 添加公告
     * @param notice
     * @return
     */
    boolean addNotice(Notice notice);

    /**
     * 获取公告详情
     * @param id
     * @return
     */
    Notice getNotice(Integer id);

    /**
     * 删除公告
     * @param ids
     * @return
     */
    boolean deleteNotice(Integer[] ids);

    /**
     * 编辑公告
     * @param notice
     * @return
     */
    boolean editNotice(Notice notice);
}
