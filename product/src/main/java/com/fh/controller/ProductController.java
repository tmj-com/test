package com.fh.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.fh.model.PinPai;
import com.fh.model.Product;
import com.fh.service.ProductService;
import com.fh.util.AjaxUtil;
@Controller
@RequestMapping("product")
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping("/addProduct")
	public String addProduct(Product product){
		productService.addProduct(product);
		return null;
	}
	@RequestMapping("/toAdd")
	private String toAdd(){
		return"add";
	}
	
	public String queryPorductlist(){
		return"";
	}
	
	@RequestMapping("/pinpaiqueryList")
	public void pinpaiqueryList(HttpServletResponse response){
		List<PinPai> pinPailist = productService.pinpaiqueryList();
		String str = JSONObject.toJSONString(pinPailist);
		AjaxUtil.util(str, response);
	}
}
