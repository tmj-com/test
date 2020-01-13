package com.fh.service;

import com.fh.common.ServerResponse;
import com.fh.mapper.NewsMapper;
import com.fh.model.News;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class NewsServiceImpl implements NewsService {

  @Resource
  private NewsMapper nwesMapper;

  @Override
  public ServerResponse addNews(News news) {
    nwesMapper.insert(news);
    return ServerResponse.success();
  }

  @Override
  public ServerResponse deleteNews(Integer id) {
    nwesMapper.deleteById(id);
    return ServerResponse.success();
  }

  @Override
  public ServerResponse deleteNewsAll(String[] ids) {
    nwesMapper.deleteBatchIds(Arrays.asList(ids));
    return ServerResponse.success();
  }

  @Override
  public ServerResponse queryNewsList(Map<String,Object>  map) {
    List<News> newsList = nwesMapper.selectByMap(map);
    return ServerResponse.success(newsList);
  }

  @Override
  public ServerResponse updateNews(News news) {
    nwesMapper.updateById(news);
    return ServerResponse.success();
  }
}
