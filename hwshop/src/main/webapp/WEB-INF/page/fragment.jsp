<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="margin-right: 50px">
		<h2>登录成功</h2>
		<h3>欢迎您，<spon style="color: red;">${user.user_name }</spon></h3>
	</div>
	<a href="${pageContext.request.contextPath}/category/selectlist ">点击查看品牌列表</a><br><br>
   <div align="center">
	<table style="">
		<tr>
			<c:forEach items="${list}" var="category">
				<td>
					<div align="center">
						<img style="width: 150px"
							src="${pageContext.request.contextPath}/res/images/${category.category_image_src}"><br>
						${category.category_name}
					</div>
				</td>
			</c:forEach>
		</tr>
	</table>
	</div>
</body>
</html>