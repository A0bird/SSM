<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	
	<script type="text/javascript">
		
	var menu='${menu}';
	
	if(menu.length>0){
		
		alert(menu);
	}
	
	window.parent.location="list.do";
	
	</script>
</body>
</html>