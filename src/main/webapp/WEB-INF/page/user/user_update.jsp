<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户修改</title>
<link rel="stylesheet" href="res/css/bootstrap.css">
<script type="text/javascript" src="res/js/jquery.min.js"></script>
<script type="text/javascript" src="res/js/bootstrap.min.js"></script>
</head>
<body>
	<div style="padding: 0px; margin: 0px;">
		<ul class="breadcrumb" style="margin: 0px; padding-left: 20px;">
			<li>系统管理</li>
			<li>用户管理</li>
			<li>修改用户</li>
		</ul>
	</div>
	<form action="user/update.do" method="post" class="form-horizontal">
		<h5 class="page-header alert-info"
			style="margin: 0px; padding: 10px; margin-bottom: 10px">用户基本信息</h5>
			<input type="hidden" name="userId" value="${users.userId }">
		<div class="row">
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">用户姓名</label>
					<div class="col-sm-9">
						<input type="text" class="form-control" name="userName"
							placeholder="请输入用户姓名" value="${users.userName }" />
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">用户性别</label>
					<div class="col-sm-5">
						<c:if test="${users.userSex==0}">
							<select name="userSex"  class="form-control">
								<!-- <option value="1" selected="selected">是</option> -->
								<option value="2" >女</option>
								<option value="1">男</option>
								<option value="0" selected="selected">保密</option>
							</select>
						</c:if>	
						<c:if test="${users.userSex==1}">
							<select name="userSex"  class="form-control">
								<!-- <option value="1" selected="selected">是</option> -->
								<option value="1" selected="selected">男</option>
								<option value="2">女</option>
								<option value="0">保密</option>
							</select>
						</c:if>
						<c:if test="${users.userSex==2}">
							<select name="userSex"  class="form-control">
								<!-- <option value="1" selected="selected">是</option> -->
								<option value="2" selected="selected">女</option>
								<option value="1">男</option>
								<option value="0">保密</option>
							</select>
						</c:if>								
						
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">用户年龄</label>
					<div class="col-sm-9">
						<input type="text" class="form-control" name="userAge"
							placeholder="请输入用户年龄" value="${users.userAge }" />
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">薪资</label>
					<div class="col-sm-9">
						<input type="text" class="form-control" name="userSalary"
							placeholder="请输入薪资" value="${users.userSalary}" />
					</div>
				</div>
			</div>
		</div>
			<h5 class="page-header alert-info"
			style="margin: 0px; padding: 10px; margin-bottom: 10px">账号信息</h5>
			<div class="row">
					<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">用户账号</label>
					<div class="col-sm-9">
						<input type="text" class="form-control" name="userAccount"
							placeholder="请输入用户账号" value="${users.userAccount }" />
					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="form-group">
					<label class="col-sm-3 control-label">用户密码</label>
					<div class="col-sm-9">
						<input type="password" class="form-control" name="userPassword"
							placeholder="请输入用户密码" value="${users.userPassword}" />
					</div>
				</div>
			</div>
			
			</div>
			<input type="hidden" name="userMark" value="${users.userMark }">
		<div class="row">
			<div class="col-sm-10" align="center">
				<input type="submit" value="修改用户" class="btn btn-success" /> <a
					href="user/list.do" class="btn btn-danger">返回上一级</a>
			</div>
		</div>
		
	</form>

</body>
</html>