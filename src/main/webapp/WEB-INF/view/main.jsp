<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8" content="text/html" http-equiv="Content-Type">
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js"></script>
    <script>
        $(function () {

            $(".logout").on("click", function () {
                window.location.href= "${pageContext.request.contextPath}/logout";
            });


        });

    </script>
    <style type="text/css">
        .login {
            background: bisque;
            width: 100%;
            height: 600px;
            align-self: center;
            border-style: solid;
        }

        .login_form {
            width: 50%;
            height: 50%;
            margin: 20% 25% 25% 30%;
        }

    </style>
</head>
<body>
<h1>登录成功</h1>
<h2>主页面</h2>

<input type="button" value="登出" class="logout" >

</body>

</html>
