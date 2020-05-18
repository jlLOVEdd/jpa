<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8" content="text/html" http-equiv="Content-Type">
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js"></script>
    <script src="${pageContext.request.contextPath}/static/layui.js" charset="utf-8"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/layui.css"  media="all">
    <script>
        $(function () {

            $(".logout").on("click", function () {
                window.location.href = "${pageContext.request.contextPath}/logout";
            });

            $(".add").click(function () {
                $(".tanchuang").toggle();
                return false;
            });


            $("body").click(function(){
                $(".tanchuang").hide();
            });


            reloadData();


        });

        function reloadData() {

            $.ajax({
                url: "${pageContext.request.contextPath}/resumes",
                type: 'post',
                dataType: 'json',
                success: function (data) {
                    $("#dataTable").html("");

                    var dataHtml = '<tr><td>ID</td><td>姓名</td><td>地址</td><td>手机号</td><td>操作</td></tr>';
                    if (data != null) {

                        for (var i = 0; i < data.length; i++) {
                            var d = data[i];
                            dataHtml += '<tr><td>' + d.id + '</td><td>' + d.name + '</td><td>' + d.address + '</td><td>' + d.phone + '</td><td><input type="button" value="编辑" onclick="edit(this)"/>' +
                                '<input type="button" value="删除" onclick="delet1(this)"/> </td></tr>';
                        }

                    }
                    $("#dataTable").html(dataHtml)
                }
            })
        }

        function edit(e) {

            var id =$(e).parent().parent().find("td:first").text();
        }

        function delet1(e) {
            var id =$(e).parent().parent().find("td:first").text();
          $.ajax({
              url:'${pageContext.request.contextPath}/delete?id='+id,
              type:'get',
              success:function (rs) {
                  if(rs.code==1){
                      alert("删除成功！");
                      reloadData();
                  }
              }
          })

        }




    </script>
    <style type="text/css">
        .table {
            background: bisque;
            width: 100%;
            height: 600px;
            align-self: center;
            border-style: solid;
        }

        .dataTable {
            width: 50%;
            height: 50%;

        }

        .tanchuang {
            width: 40%;
            height: 50%;
            display: none;
            position: fixed;
            top: 0;
            left: 0;
            background-color: rgba(0, 0, 0, .5);
            z-index: 9999;
        }


    </style>
</head>
<body>
<h1>登录成功</h1>
<h2>主页面</h2>

<input type="button" value="登出" class="logout">
<button data-method="offset" data-type="t" class="layui-btn layui-btn-normal">新增数据</button>

<div class="table">
    <table id="dataTable" class="dataTable">

    </table>
</div>


<div class="tanchuang">
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
