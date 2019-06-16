package org.octans.project.dao;

import org.octans.project.entity.entity.Article;

import java.util.List;

public interface ArticleMapper {
    List<Article> selectAll();
}
