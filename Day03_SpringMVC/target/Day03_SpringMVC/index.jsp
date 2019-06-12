<%--
  Created by IntelliJ IDEA.
  User: XHT
  Date: 2019/6/8
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/account/findAll">测试查询所有</a><br/>
<a href="/account/add">测试添加</a><br/>


<form action="/account/add" method="post">
    姓名：<input type="text" name="name"/><br/>
    金额：<input type="text" name="money"/><br/>
    <input type="submit" value="保存"/><br/>
</form>
</body>
</html>
