<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8" content="text/html" http-equiv="Content-Type">
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js"></script>
    <script>
        $(function () {

            $(".logout").on("click", function () {
                window.location.href = "${pageContext.request.contextPath}/logout";
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

    </style>
</head>
<body>
<h1>登录成功</h1>
<h2>主页面</h2>

<input type="button" value="登出" class="logout">

<div class="table">
    <table id="dataTable" class="dataTable">

    </table>
</div>


</body>

</html>
