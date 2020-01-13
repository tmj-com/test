package com.fh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.model.News;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NewsMapper extends BaseMapper<News> {
}
