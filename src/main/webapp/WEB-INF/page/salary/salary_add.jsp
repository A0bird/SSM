<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>薪资发放</title>
<link rel="stylesheet" href="res/css/bootstrap.css">
<script type="text/javascript"
	src="<%=basePath%>res/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="res/js/jquery.min.js"></script>
<script type="text/javascript" src="res/js/bootstrap.min.js"></script>
</head>
<body>
	<div style="padding: 0px; margin: 0px;">
		<ul class="breadcrumb" style="margin: 0px; padding-left: 20px;">
			<li>薪资管理</li>
			<li>薪资发放</li>

		</ul>
	</div>
	<form action="salary/add.do" method="post" class="form-horizontal">
		<h5 class="page-header alert-info"
			style="margin: 0px; padding: 10px; margin-bottom: 10px">基本信息</h5>
			
		<div class="row">
			<div class="col-sm-7">
				<div class="form-group">
					<label class="col-sm-3 control-label">领取人</label>
					<div class="col-sm-9">
						<select name="userId" class="form-control">
						<c:forEach  items="${users}" var="users">
								<option  value="${users.userId}">${users.userName}</option>
						</c:forEach>
						</select>
					</div>
				</div>
			</div>
			<div class="col-sm-7">
				<div class="form-group">
					<label class="col-sm-3 control-label">发放时间</label>
					<div class="col-sm-5">
						<input type="text" class="form-control"  onclick="WdatePicker()" data-rule="报销时间:required;"
						 name="paymentTime"  placeholder="请输入发放时间" />
					</div>
				</div>
			</div>
			<div class="col-sm-7">
				<div class="form-group">
					<label class="col-sm-3 control-label">发放金额</label>
					<div class="col-sm-9">
						<input type="text" class="form-control" placeholder="请输入发放金额"  name="paymentMoney"/>
					</div>
				</div>
			</div>
	
		</div>
		<div class="row">
			<div class="col-sm-7" align="center">
				<input type="submit" value="确认发放" class="btn btn-success" /> 
			</div>
		</div>
	</form>

</body>
</html>