<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>费用修改</title>
<link rel="stylesheet" href="res/css/bootstrap.css">
<script type="text/javascript" src="res/js/jquery.min.js"></script>
<script type="text/javascript" src="res/js/bootstrap.min.js"></script>
</head>
<body>
	<div style="padding: 0px; margin: 0px;">
		<ul class="breadcrumb" style="margin: 0px; padding-left: 20px;">
			<li>系统管理</li>
			<li>费用管理</li>
			<li>修改费用</li>
		</ul>
	</div>
	<form action="cost/update.do" method="post" class="form-horizontal">
		<h5 class="page-header alert-info"
			style="margin: 0px; padding: 10px; margin-bottom: 10px">费用基本信息</h5>
			<input type="hidden" name="costId"  value="${cost.costId}">
		<div class="row">
			<div class="col-sm-7">
				<div class="form-group">
					<label class="col-sm-3 control-label">费用名称</label>
					<div class="col-sm-9">
						<input type="text" class="form-control" name="costName"
							placeholder="请输入费用名称" value="${cost.costName }"/>					
					</div>
				</div>
			</div>
			<div class="col-sm-7">
				<div class="form-group">
					<label class="col-sm-3 control-label">费用描述</label>
					<div class="col-sm-9">
						<textarea rows="" cols="" class="form-control" name="costDesc"
							placeholder="请输入费用描述信息">${cost.costDesc }</textarea>
					</div>
				</div>
			</div>
		</div>
		<input type="hidden" name="costMark" value="${cost.costMark}">
		<div class="row">
			<div class="col-sm-7" align="center">
				<input type="submit" value="修改费用" class="btn btn-success"/>
				<a href="cost/list.do" class="btn btn-danger">返回上一级</a>
			</div>
		</div>
	</form>

</body>
</html>