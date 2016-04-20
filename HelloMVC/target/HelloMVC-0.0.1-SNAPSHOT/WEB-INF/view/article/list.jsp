<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	게시판 목록 입니다.
	<table border="1">
		<tr>
			<td>${ number }</td>
			<td>${ title }</td>
			<td>날짜</td>

		</tr>
		<tr>
			
			<td><a href="/HelloMVC/detail/1">1</a></td>
			<td>${ author }</td>
			<td>${ date }</td>
		</tr>
	</table>
</body>
</html>