<%@page import="javabeans.ScoreBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% javabeans.ScoreBean score = new ScoreBean(); %>
	<hr>
	<h3>ScoreBean에 저장</h3><p>
	이름 : <%= "김성민" %>,
	성적 : <%= "85" %><p>
	<%score.setName("김성민"); %>	
	<%score.setPoint(85); %>
	
	<h3>저장된 정보 출력</h3>
	이름 : <%out.println(score.getName());%><p>
	성적 : <%out.println(score.getPoint());%>	
</body>
</html>