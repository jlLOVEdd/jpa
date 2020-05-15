<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8" content="text/html" http-equiv="Content-Type">
    <script type="text/javascript" src="static/js/jquery-3.4.1.js"></script>
    <script>
        $(function () {

            $(".test").on("click",function () {
                alert(11111111)
            });


        });

    </script>
    <style type="text/css">
        .login{
            background: bisque;
            width: 100%;
            height: 600px;
            align-self: center;
            border-style:solid;
        }
        .login_form{
            width: 50%;
            height: 50%;
            margin: 20% 25% 25% 30%;
        }

    </style>
</head>
<body>
<h2>Hello World!</h2>
<div class="login">
    <div class="login_form" >
        <form action="login" method="post">
          <label>用户：</label>  <input type="text"  name="name"/><br>
          <label>密码：</label>  <input type="password" name="password"/><br>
            <input type="submit" value="登录" class="submit">
        </form>
    </div>
</div>

</body>

</html>
