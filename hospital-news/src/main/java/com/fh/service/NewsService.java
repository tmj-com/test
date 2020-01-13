package com.fh.service;

import com.fh.common.ServerResponse;
import com.fh.model.News;

import java.util.Map;

public interface NewsService {
  ServerResponse addNews(News news);

  ServerResponse deleteNews(Integer id);

  ServerResponse deleteNewsAll(String[] ids);

  ServerResponse queryNewsList(Map<String,Object>  map);

  ServerResponse updateNews(News news);
}
