<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.3.1.min.js">
</script>
</head>
<script type="text/javascript">
	$(function(){
		pinpai();
	})
	
	function pinpai(){
		$.post({
				url:"<%=request.getContextPath()%>/product/pinpaiqueryList.do",
				dataType:"json",
				success:function(data){
					/* <select name="pinPai">
					<option value="1">zhi</option>
				</select> */
				
					var cc="<select name='pinPai'>";
					for(var i=0;i<data.length;i++){
						cc+="<option value='"+data[i].pid+"'>"+data[i].pname+"</option>";
					}
					cc+="</select>";
					$("#pinpaidiv").html(cc);
				},
				error:function(){
					alert("下拉框请求异常")
				}
			})
	}
</script>
<body>
<form action="<%=request.getContextPath()%>/product/addProduct.do" method="post">
	名称:<input type="text" name="productname">
	价格:<input type="text" name="price">
	品牌:<div id="pinpaidiv"></div>
	<input type="submit"><input type="reset">
</form>
</body>
</html>