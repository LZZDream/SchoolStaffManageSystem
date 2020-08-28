<%--
  Created by IntelliJ IDEA.
  User: lzz
  Date: 2020/8/23
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script type="text/javascript" src="static/js/jquery-3.5.1.min.js"></script>
    <%--<link href="static/bootstrap-3.3.7/css/bootstrap.css">--%>
    <%--<script href="static/bootstrap-3.3.7/js/bootstrap.js"></script>--%>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</head>
<body>
<button type="button" onclick="login()"  class="btn btn-success">登录</button>
<button type="button"  onclick="signin()" class="btn btn-success">招聘信息</button>
</body>
<script>
    function login(){
        window.location.href="${pageContext.request.contextPath}/login.jsp";
    }
    function signin(){
        window.location.href="recruitment_information";
    }
</script>
</html>
