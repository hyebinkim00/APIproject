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


<div class="container">
<div class="row">
<div class="col-lg-12">




<form action="/tests/register" method="post">

<div class="form-group">
<label>ID</label><input class="form-control" name="id">
</div>

<div class="form-group">
<label>PWD</label><input class="form-control" name="pwd">
</div>

<button type="submit" class="btn btn btn-primary">Submit</button>
<button type="reset" class="btn btn btn-primary">Reset</button>
</form>


</div>


</div>
</div>


</body>
</html>