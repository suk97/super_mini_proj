<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function login() {
	document.member.command.value="login";
	document.member.submit();
}
function join() {
	document.member.command.value="join";
	document.member.submit();
}
</script>

</head>
<body>
	<form id="member" action="member" method="post">
		<input type="text" name="mId" placeholder="ID"></input> <br>
		<input type="password" name="mPw"placeholder="PW"></input> <br>
		<input type="button" value="로그인" onClick="login()"></input> <br>
		<input type="button" value="회원가입" onClick="join()"></input>
		<input type="hidden" name="command" value=""></input>
	</form>
</body>
</html>