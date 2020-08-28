<%--
  Created by IntelliJ IDEA.
  User: lzz
  Date: 2020/8/27
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/signin" method="post" id="signForm">
    账号：<input name="account"><br>
    密码：<input name="password"><br>
    <p style="color: red" id="msg">${msg}</p>
    <button onclick="signinForm();popone()">提交</button>
    <button onclick="popone()">haha</button>





</form>




<%
    String errorInfo = (String)request.getAttribute("successSignin");         // 获取错误属性
    if(errorInfo != null) {
%>
<script type="text/javascript" language="javascript">
    alert("<%=errorInfo%>");                                            // 弹出错误信息

    window.location='login.jsp' ;                            // 跳转到登录界面
</script>
<%
    }
%>



<script>
    function signinForm() {
        console.log("pp");
        $("#Form").submit();
    }
    
    function popone() {
        alert("注册成功");
    }
</script>


</body>
</html>
