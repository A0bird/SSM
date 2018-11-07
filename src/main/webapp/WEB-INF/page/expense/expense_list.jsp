<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<%@ taglib prefix="pg" uri="http://jsptags.com/tags/navigation/pager"%>
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
			<li>报销查询</li>
		</ul>
	</div>
	<form action="expense/list.do" method="post" id="f1"
		class="form-inline">
		<div class="row alert alert-info" style="margin: 0px; padding: 5px;">
			<div class="form-group">
				<label>报销人</label> <input type="text" class="form-control"
					name="roleName" placeholder="请输入报销人" /> <label>报销时间</label> <input
					type="text" class="form-control" name="roleName"
					placeholder="请输入报销时间" />
			</div>
			<input type="submit" value="查询报销单" class="btn btn-success" />
		</div>

		<div class="row" style="padding: 15px;">
			<%-- <table class="table ">
				<tr>

					<th>报销编号</th>
					<th>报销原因</th>
					<th>报销人</th>
					<th>报销时间</th>
					<th>报销总金额</th>
					<th>查看明细</th>
				</tr>
				<c:forEach items="${list }" var="expense">
					<tr>
						<td>${expense.expenseId }</td>
						<td>${expense.expenseDesc }</td>
						<td>${expense.userName }</td>
						<td><fmt:formatDate value='${expense.expenseTime}' pattern='yyyy-MM-dd'/></td>
						<td>${expense.expenseTotal }</td>
						<th><a href="expense/show.do?expenseId=${expense.expenseId }">查看明细</a></th>
					</tr>
				</c:forEach>
			</table> --%>
			<pg:pager url="expense/list.do" index="half-full"
				export="currentPageNumber=pageNumber" maxPageItems="2"
				maxIndexPages="10">

				<table class="table ">
					<tr>
						<TD>报销编号</TD>
						<TD>报销人</TD>
						<TD>报销时间</TD>
						<TD>报销总金额</TD>
						<TD>查看明细</TD>
					</tr>
					<c:if test="${!empty list}">
						<c:forEach items="${list}" var="expense">
							<pg:item>
								<tr>
									<td>${expense.expenseId  }</td>
									<td>${expense.userName }</td>
									<td><fmt:formatDate value='${expense.expenseTime}'
											pattern='yyyy-MM-dd' /></td>
									<td>${expense.expenseTotal }</td>
									<td><a
										href="expense/show.do?expenseId=${expense.expenseId }">查看明细</a></td>
								</tr>
							</pg:item>
						</c:forEach>
					</c:if>
					<c:if test="${empty list}">
						<tr>
							<td>没有找到相应的记录</td>
						</tr>
					</c:if>
				</table>
				<pg:index>
					<center>

						<table>
							<tr align=center valign=top>
								<pg:prev ifnull="true">
									<%
										if (pageUrl != null) {
									%>
									<td align=right><A HREF="<%=pageUrl%>"><IMG
											SRC=http://www.google.com/nav_previous.gif alt="" border=0><br>
											<b style="margin-right:10px;">上一页</b></A></td>
									<%
										} else {
									%>
									<td><IMG SRC=http://www.google.com/nav_first.gif alt=""
										border=0></td>
									<%
										}
									%>
								</pg:prev>
								<pg:pages>
									<%
										if (pageNumber == currentPageNumber) {
									%>
									<td style="padding:0px 8px 0"><IMG SRC=http://www.google.com/nav_current.gif alt=""><br>
										<font color=#A90A08><%=pageNumber%></font></td>
									<%
										} else {
									%>
									<td><A HREF="<%=pageUrl%>"><IMG
											SRC=http://www.google.com/nav_page.gif alt=""><br>
											<%=pageNumber%></A></td>
									<%
										}
									%>
								</pg:pages>
								<pg:next ifnull="true">
									<%
										if (pageUrl != null) {
									%>
									<td><A HREF="<%=pageUrl%>"><IMG
											SRC=http://www.google.com/nav_next.gif alt=""><br>
											<b style="margin-left:10px">下一页</b></A></td>
									<%
										} else {
									%>
									<td><IMG SRC=http://www.google.com/nav_last.gif alt=""></td>
									<%
										}
									%>
								</pg:next>
							</tr>
						</table>
					</center>
				</pg:index>
			</pg:pager>
		</div>
	</form>
</body>
</html>
