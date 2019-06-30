<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/product/doadd" methos="POST">

  name<input type="text" name="product_name"/><br><br>
  title<input type="text" name="product_title"/><br><br>
  price<input type="text" name="product_price"/><br><br>
  sale_price<input type="text" name="product_sale_price"/><br><br>
  category_id<input type="text" name="product_category_id"/><br><br>
  isEnable<input type="text" name="product_isEnable"/><br><br>
  <input type="submit" value="提交">
</form> 
</body>
</html>