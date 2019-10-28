<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>发送结果</title>
</head>
<%String res=(String)request.getAttribute("res"); %>
<body>
<p>发送状态:<%=res%></p>
</body>
</html>