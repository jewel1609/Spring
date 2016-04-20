<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
 $(document).ready( function() {
	
	 var t = ${ date };
	 setInterval(t, 1000);
	 
 });



</script>
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
	<br/>
<table border="1">	
	<tr>
		<td>&nbsp;&nbsp;아이디</td>
		<td>&nbsp;&nbsp;이름</td>
		<td>&nbsp;&nbsp;성</td>
		<td>&nbsp;&nbsp;이메일</td>
		<td>&nbsp;&nbsp;고용날짜</td>
		<td>&nbsp;&nbsp;부서명</td>
		<td>&nbsp;&nbsp;연봉</td>
		<td>&nbsp;&nbsp;커미션</td>
		<td>&nbsp;&nbsp;매니저_번호</td>
	</tr>
	
<c:forEach items="${allEmployees}" var="employee">
<!-- &nbsp; 한칸 공백 -->
	<tr>
		<td>
			&nbsp;&nbsp;${employee.employeeId}
		</td>
		<td> 
			&nbsp;&nbsp;${employee.firstName}
		</td> 
		<td>
			&nbsp;&nbsp;${employee.lastName}
		</td> 
		<td>
			&nbsp;&nbsp;${employee.email}
		</td>
		<td> 
			&nbsp;&nbsp;${employee.hireDate}
		</td>
		<td> 
			&nbsp;&nbsp;${employee.departmentName}
		</td>
		<td> 
			&nbsp;&nbsp;${employee.salary}
		</td>
		<td> 
			&nbsp;&nbsp;${employee.commissionPct}
		</td>
		<td> 
			&nbsp;&nbsp;${employee.managerId}
		</td>
	</tr>
</c:forEach>
</table>
	
</body>
</html>