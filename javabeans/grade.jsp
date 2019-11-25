<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setCharacterEncoding("UTF-8"); %>
	<jsp:useBean id="score" class="javabeans.GradeBean" scope="page"/>
	<hr>
	
	<h3>GradeBean에 데이터 저장</h3>
	이름 : <%= request.getParameter("name") %>
	성적 : <%= request.getParameter("point") %>
	<jsp:setProperty property="name" name="score"/>
	<jsp:setProperty property="point" name="score"/>
	
	<h3>저장된 정보 출력</h3>
	이름 : <jsp:getProperty property="name" name="score"/><p>
	성적 : <jsp:getProperty property="point" name="score"/><p>
	등급 : <jsp:getProperty property="grade" name="score"/><p>
</body>
</html>