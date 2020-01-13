package com.fh.util;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IdUtil {

  public static String createId(){

    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
    String format = sdf.format(new Date());
    return format+IdWorker.getId();
  }
}
