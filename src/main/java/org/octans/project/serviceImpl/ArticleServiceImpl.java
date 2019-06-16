package org.octans.project.serviceImpl;

import org.octans.project.dao.ArticleMapper;
import org.octans.project.entity.entity.Article;
import org.octans.project.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class ArticleServiceImpl implements ArticleService {
    private final ArticleMapper articleMapper;

    @Autowired
    public ArticleServiceImpl(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }


    @Override
    public List<Article> getAllArticle() {
        return articleMapper.selectAll();
    }
}
