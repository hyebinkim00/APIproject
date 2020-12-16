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

<h1>Read Page</h1>
<div class="container">
<div class="row">
<c:out value="${test.id }"> </c:out>
<c:out value="${test.pwd }"></c:out>
<fmt:formatDate pattern="yyyy-MM-dd" value="${test.time }"/>
</div>
</div>
</body>
</html>