package org.octans.project.serviceImpl;

import org.octans.project.dao.NoticeMapper;
import org.octans.project.entity.dto.notice.NoticeA01DTO;
import org.octans.project.entity.entity.Notice;
import org.octans.project.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class NoticeServiceImpl implements NoticeService {
    private final NoticeMapper noticeMapper;

    @Autowired
    public NoticeServiceImpl(NoticeMapper noticeMapper) {
        this.noticeMapper = noticeMapper;
    }

    @Override
    public List<NoticeA01DTO> getNoticeList(String title, String content) {
        return noticeMapper.selectByQuery(title,content);
    }

    @Override
    public boolean addNotice(Notice notice) {
        return noticeMapper.insert(notice) > 0;
    }

    @Override
    public Notice getNotice(Integer id) {
        return noticeMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean deleteNotice(Integer id) {
        return noticeMapper.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public boolean editNotice(Notice notice) {
        return noticeMapper.updateByPrimaryKey(notice) > 0;
    }
}
