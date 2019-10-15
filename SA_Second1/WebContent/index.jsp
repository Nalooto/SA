<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>index</title>
</head>
<body>
<!--head-->
<div class="head",background-color="red",width="100%",height="20px">查询数据</div>
<!--body-->
<div class="body">
<form action="test",method="POST">
        <select name="Selecttion">
            <option value ="change">涨幅变化</option>
           <!--  <option value ="minValue">最低价</option> -->
            <!-- <option value="finalValue">收盘价</option> -->
            <!-- <option value="midValue">均价</option> -->
        </select>
    <input type="submit",value="Submit">
</form>
</div>
</body>
</html>
