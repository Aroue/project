package org.octans.project.dao;

import org.apache.ibatis.annotations.Param;
import org.octans.project.entity.dto.notice.NoticeA01DTO;
import org.octans.project.entity.entity.Notice;

import java.util.List;

public interface NoticeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);

    List<NoticeA01DTO> selectByQuery(@Param("title")String title, @Param("content")String content);
}