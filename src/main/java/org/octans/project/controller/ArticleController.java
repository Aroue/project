package org.octans.project.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mybatis.spring.annotation.MapperScan;
import org.octans.project.entity.entity.Article;
import org.octans.project.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api("文章API")
@RequestMapping("/article")
public class ArticleController {
    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @ApiOperation(value = "全部文章获取", notes = "全部文章获取（文章条数和访问总数）", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(method = RequestMethod.GET, value = "/getAll")
    public List<Article> getAll(){
        return articleService.getAllArticle();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String test(){
        return "hello world";
    }


}
