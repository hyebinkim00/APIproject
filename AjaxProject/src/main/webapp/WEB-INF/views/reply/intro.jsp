<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="../include/css.jsp"%>
<%@ include file="../include/script.jsp"%>
<meta http-equiv="Content-Type"   content="text/html">
<title>Insert title here</title>
</head>
<body>

<h1>List Page</h1>
<div class="container">
<div class="row">
<table class="table table-striped tabel-bordered table-hover">
<tr><th>이름</th><th>비밀번호</th><th>회원번호</th><th>등록일</th></tr> 

<c:forEach items="${list}" var="list">
<tr>
<td><c:out value="${list.rno}"></c:out></td>
<td><c:out value="${list.replyer}"></c:out></td>
<td><fmt:formatDate pattern="yyyy-MM-dd" value="${list.replydate}"/></td>
</tr>
</c:forEach>

</table>
</div>
</div>
</body>
</html>