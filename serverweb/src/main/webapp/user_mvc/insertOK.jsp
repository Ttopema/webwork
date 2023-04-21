<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//공유된 데이터 꺼내기
		String name = (String) request.getAttribute("insertuser"); //캐스팅 해줘야함 //꺼내올때 insertuser라는 이름으로 꺼내옴
		
	%>
	<h1>자바나라쇼핑몰</h1>
	<hr/>
	<h2><%= name %>님 가입을 축하합니다.!!!</h2>
</body>
</html>