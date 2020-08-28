<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>
    <title>信息管理</title>
    <!--favicon-->

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>



</head>

<body class="bg-dark">
<!-- Start wrapper-->
<div id="wrapper">
    <div class="card card-authentication1 mx-auto my-5">
        <div class="card-body">
            <div class="card-content p-2">

                <div class="card-title text-uppercase text-center py-3">登录</div>
                <form action="${pageContext.request.contextPath}/login" method="post" id="userForm">
                    <div class="form-group">
                        <label for="exampleInputUsername" class="">Username</label>
                        <div class="position-relative has-icon-right">
                            <input type="text" id="exampleInputUsername" class="form-control input-shadow" name="account">
                            <div class="form-control-position">
                                <i class="icon-user"></i>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword" class="">Password</label>
                        <div class="position-relative has-icon-right">
                            <input type="password" id="exampleInputPassword" name="password" class="form-control input-shadow" >
                            <div class="form-control-position">
                                <i class="icon-lock"></i>
                            </div>
                        </div>
                    </div>
                    <p style="color: red" id="msg">${msg}</p>
                    <button type="button" onclick="loginForm()" class="btn btn-primary shadow-primary btn-block waves-effect waves-light">登录</button>
                    <button type="button" onclick="SignIn()" class="btn btn-primary shadow-primary btn-block waves-effect waves-light">注册</button>
                    <button type="button" onclick="test()" class="btn btn-primary shadow-primary btn-block waves-effect waves-light">haha</button>

                </form>
            </div>
        </div>
    </div>


</div><!--wrapper-->

<!-- Bootstrap core JavaScript-->
<script src="${pageContext.request.contextPath}/static/js/jquery-3.5.1.js"></script>
<script src="static/popper/popper.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>
<%--<script src="static/plugins/simplebar/js/simplebar.js"></script>--%>
<script>
    function loginForm() {
        var account=$("#exampleInputUsername").val();
        var password=$("#exampleInputPassword").val();
        console.log(account);
        if (account.length==0 || password.length==0){
            $("#msg").html("账号名或密码不能为空")
        }else {
            $("#userForm").submit();
        }
    }

    function SignIn() {
        location.href="${pageContext.request.contextPath}/sign_in.jsp";
    }


</script>



</body>
</html>
