<%--
  Created by IntelliJ IDEA.
  User: XHT
  Date: 2019/6/5
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.2.1.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                //alert("hello,btn")
                //发送ajax请求
                $.ajax({
                    //请求路径
                    url:"user/testAjax",
                    //向服务器发送json类型
                    contentType:"application/json;charset=UTF-8",
                    //发送数据
                    data:'{"username":"hehe","password":123}',
                    //返回类型
                    dataType:"json",
                    //请求方式
                    type:"post",
                    success:function (data) {
                        //data服务器响应json数据
                        alert(data)
                        alert(data.username)
                        alert(data.password)
                    }
                })
            })
        })
        
    </script>

</head>
<body>
<%--json过滤静态资源--%>
<button id="btn">发送json请求</button>

</body>
</html>
