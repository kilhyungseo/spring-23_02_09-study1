<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		아이디는 : ${memberId } 이고, 암호는 ${memberPw } 입니다.
		<br><br>
		
		이름 : ${mname }
		<br><br>
		
		<form action="">
			이름 : <input type="text" name="mname"><br>
			<input type="submit" value="이름입력">
		
		
		</form>
		
</body>
</html>