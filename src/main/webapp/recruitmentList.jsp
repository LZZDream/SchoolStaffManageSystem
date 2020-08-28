<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lzz
  Date: 2020/8/28
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>招聘信息</title>
    <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
    <!-- 引入样式 -->
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
    <!-- 引入组件库 -->
    <script src="https://unpkg.com/element-ui/lib/index.js"></script>
</head>
<body>
<p >招聘信息</p>

<table  border="1">
    <thead>
    <tr>
        <th scope="col">编号</th>
        <th scope="col">部门</th>
        <th scope="col">岗位数量</th>
        <th scope="col">工作地点</th>
        <th scope="col">日工资</th>
        <th scope="col">提交简历</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${recruitmentPlanTable}" var="user" >
        <tr>
            <td>${user.id}</td>
            <td>${user.department}</td>
            <td>${user.peopleNumber}</td>
            <td>${user.workAddress}</td>
            <td>${user.money}</td>
            <td><button onclick="resume">提交简历</button></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<button onclick="refersh()">刷新</button>

<script>
    function refersh() {
        window.location.href="recruitment_information";
    }
    function resume() {
        window.location.href="submitResume";
    }
</script>
</body>
</html>
