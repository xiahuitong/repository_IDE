<%--
  Created by IntelliJ IDEA.
  User: XHT
  Date: 2019/6/4
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--请求参数获取--%>
<%--<form action="user/javaBean" method="post">--%>
    <%--用户名:<input type="text" name="username"><br>--%>
    <%--密码:<input type="password" name="password"><br>--%>
    <%--金额:<input type="text" name="money"><br>--%>
    <%--&lt;%&ndash;javaBean对象封装&ndash;%&gt;--%>
    <%--学生年龄:<input type="text" name="student.age"><br>--%>
    <%--学生出生地址:<input type="text" name="student.address"><br>--%>
    <%--&lt;%&ndash;list集合对象封装&ndash;%&gt;--%>
    <%--学生年龄:<input type="text"name="list[0].age">--%>
    <%--学生出生地址:<input type="text"name="list[0].address">--%>
    <%--&lt;%&ndash;map集合对象封装&ndash;%&gt;--%>
    <%--学生年龄:<input type="text" nam e="map['one'].age">--%>
    <%--学生出生地址:<input type="text" name="map['one'].address">--%>
    <%--<input type="submit" value="提交">--%>
<%--</form>--%>

<%--自定义请求参数--%>
<form action="user/custom" method="post">
    用户名:<input type="text" name="username"><br>
    密码:<input type="text" name="password"><br>
    出生日期:<input type="text" name="birthday"><br>
    <input type="submit" value="提交">
</form>







</body>
</html>
