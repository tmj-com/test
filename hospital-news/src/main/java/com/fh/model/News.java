package com.fh.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@TableName("t_news")
public class News {
  @TableId(value = "id",type = IdType.AUTO)
  private Integer id;//主键
  private String title;//标题
  private String photograph;//图片
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date creationtime;//创建时间
  private String content;//内容
  private Integer status;//状态

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getPhotograph() {
    return photograph;
  }

  public void setPhotograph(String photograph) {
    this.photograph = photograph;
  }

  public Date getCreationtime() {
    return creationtime;
  }

  public void setCreationtime(Date creationtime) {
    this.creationtime = creationtime;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public News(Integer id, String title, String photograph, Date creationtime, String content, Integer status) {

    this.id = id;
    this.title = title;
    this.photograph = photograph;
    this.creationtime = creationtime;
    this.content = content;
    this.status = status;
  }

  public News() {

  }
}
