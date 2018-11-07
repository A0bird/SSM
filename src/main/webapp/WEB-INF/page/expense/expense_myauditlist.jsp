<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的报销单</title>
<link rel="stylesheet" href="res/css/bootstrap.css">
<script type="text/javascript" src="res/js/jquery.min.js"></script>
<script type="text/javascript" src="res/js/bootstrap.min.js"></script>
</head>
<body>
	<div style="padding: 0px; margin: 0px;">
		<ul class="breadcrumb" style="margin: 0px; padding-left: 20px;">
			<li>报销管理</li>
			<li>我的审核</li>
		</ul>
	</div>
	<form action="" method="post" id="f1" class="form-inline">
		<div class="row alert alert-info" style="margin: 0px; padding: 5px;">
			<div class="form-group">
						<label>报销人</label> <input type="text" class="form-control"
					name="roleName" placeholder="请输入报销人" /> 
				<label>报销时间</label> <input type="text" class="form-control"
					name="roleName" placeholder="请输入报销时间" />
			</div>
			<input type="submit" value="查询报销单" class="btn btn-success" />
		</div>

		<div class="row" style="padding: 15px;">
			<table class="table ">
				<tr>

					<th>报销编号</th>
					<th>报销原因</th>
					<th>报销人</th>
					<th>报销时间</th>
					<th>报销总金额</th>
					<th>查看明细</th>
				</tr>
					
				<c:forEach items="${list}"  var="e">
				<tr>
					<td>${e.expenseId }</td>
					<td>${e.expenseName}</td>
					<td>${e.userName }</td>
					<td><fmt:formatDate value="${e.expenseTime }" type="date"/></td>
					<td>${e.expenseTotal}</td>
					<th><a href="expense/show.do?expenseId=${e.expenseId}">审核</a></th>
					</tr>
				</c:forEach>
					
			</table>

		</div>
	</form>
</body>
</html>