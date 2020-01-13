package com.fh.util;

import com.fh.common.ServerResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("resubmit")
public class Resubmit {

  @RequestMapping("getMtoken")
  @ResponseBody
  public ServerResponse getMtoken(){
    UUID string = UUID.randomUUID();
    String mtoken = string.toString();
    RedisUtil.set("mtoken",mtoken);
    return ServerResponse.success(mtoken);
  }

}
