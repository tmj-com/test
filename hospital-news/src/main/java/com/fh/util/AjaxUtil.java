package com.fh.util;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class AjaxUtil {
	public static void util(String str,HttpServletResponse response){
		
		//获取response
				//防止中文乱码
				response.setCharacterEncoding("UTF-8");
				//设置响应内容
				response.setContentType("application/json");
				PrintWriter writer = null; 
				try {
					writer = response.getWriter();
					
					writer.write(str);
					writer.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					if (writer!= null) {
						writer.close();
						writer = null;
					}
					
				}
	}
}
