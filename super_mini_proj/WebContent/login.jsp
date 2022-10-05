<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login.do" method="post">
		<br/><br/><br/><br/>
		ID : <input type="text" name="id" class="" placeholder="ID를 입력하세요."/><br/><br/>
		PW : <input type="password" name="pw" class="" placeholder="PW를 입력하세요."/> <hr/><br/>
		<button type="submit">로그인</button>
		<a href="signUp.jsp">회원가입</a>
		<a href="findPw.jsp">비밀번호를 잊으셨습니까?</a>
	</form>
</body>
</html>