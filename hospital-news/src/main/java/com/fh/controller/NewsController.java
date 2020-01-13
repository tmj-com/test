package com.fh.controller;

import com.fh.common.ServerResponse;
import com.fh.model.News;
import com.fh.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("news")
@CrossOrigin
public class NewsController {
  @Autowired
  private NewsService newsService;

  @RequestMapping("queryNewsList")
  public ServerResponse queryNewsList(){
    Map<String,Object>  map = new HashMap<String,Object> ();
    return newsService.queryNewsList(map);
  }


  @RequestMapping("addNews")
  public ServerResponse addNews(News news){
    return newsService.addNews(news);
  }


  @RequestMapping("updateNews")
  public ServerResponse updateNews(News news){
    return newsService.updateNews(news);
  }

  @RequestMapping("deleteNews")
  public ServerResponse deleteNews(Integer id){
    return newsService.deleteNews(id);
  }


  @RequestMapping("deleteNewsAll")
  public ServerResponse deleteNewsAll(String[] ids){
    return newsService.deleteNewsAll(ids);
  }
}
