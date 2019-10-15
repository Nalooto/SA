<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="DAO.*" %>
<%@ page import="java.util.*"%>
<!DOCTYPE>
<html>
<head>
<title>开盘价的历史涨幅变化</title>
</head>
<%
 double change=(double)request.getAttribute("res");
%>
<body>
<p>开盘价的历史涨幅变化:<%=change %></p>
<span></span>
</body>


</html>
