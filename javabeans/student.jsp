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
	<jsp:useBean id="student" class="javabeans.StudentBean" scope="page"/>
	<h3>StudentBean에 저장</h3>
	<jsp:setProperty property="*" name="student"/>
	<hr>
	<h3>저장된 정보 조회 및 출력</h3>
	
	학생 ID : <jsp:getProperty property="ID" name="student"/><p>
	학생 이름 : <jsp:getProperty property="name" name="student"/><p>
	학생 번호 : <jsp:getProperty property="snum" name="student"/><p>
	나이(생년) <%=student.getAge() %> (<jsp:getProperty property="ID" name="student"/>)<p>
	암호 : <jsp:getProperty property="password" name="student"/><p>
	암호 : <jsp:getProperty property="email" name="student"/><p>
	
		
</body>
</html>