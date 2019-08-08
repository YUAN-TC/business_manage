<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/8/6
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <thead>
    <th>用户id</th>
    <th>用户姓名</th>
    <th>用户密码</th>
    <th>用户邮箱</th>
    <th>用户电话</th>
    <th>操作</th>
    </thead>
    <b:forEach items="${user}" var="user">
        <tr>
            <th>${user.id}</th>
            <th>${user.username}</th>
            <th>${user.password}</th>
            <th>${user.email}</th>
            <th>${user.phone}</th>
            <th>
                <a href="update/${user.username}">修改</a>

                <a href="delete/${user.id}">删除</a>
            </th>
        </tr>
    </b:forEach>
    <a href="insert">>>>>添加一个</a>
</table>

</body>
</html>
