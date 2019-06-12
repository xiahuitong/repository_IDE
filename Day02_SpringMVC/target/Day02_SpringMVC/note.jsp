<%--
  Created by IntelliJ IDEA.
  User: XHT
  Date: 2019/6/5
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script ></script>
</head>
<body>
<a href="user/note?name=hehe">请求参数绑定</a>

<form action="user/fro" method="post">
    用户名:<input type="text" name="username"><br>
    密码:<input type="text" name="password"><br>
    出生日期:<input type="text" name="birthday"><br>
    <input type="submit" value="提交">
</form>

<%--响应返回String类型--%>
<a href="user/str">响应返回String类型</a>

<%--响应返回void类型--%>

<a href="user/none">响应返回void类型</a>

<%--响应的返回值式ModelAndView--%>
<a href="user/ModelAndView">ModelAndView</a>

<%--响应Forward和Redirect--%>
<a href="user/ForRed">testForwarOrRedirect</a>


</body>
</html>
