<%--
  Created by IntelliJ IDEA.
  User: XHT
  Date: 2019/6/6
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>文件上传</h3>

<%--传统方式发送文件--%>
<%--enctype="multipart/form-data"  表示多媒体表单  没有设置表示普通表单--%>
<form action="user/fileupload" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"/><br/>
    <input type="submit" value="上传文件"/>
</form>


<%--MVC方式传输--%>
<form action="user/fileupload1" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"/><br/>
    <input type="submit" value="上传文件"/>
</form>






</body>
</html>
