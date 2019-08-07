<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/8/6
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>修改用户</h1>

<form action="" method="post">
    <input type="hidden" name="id" value="${user.id}"><br/>
    用户名称 <input type="text" name="username" value="${user.username}"><br/>
    用户密码 <input type="text" name="password" value="${user.password}"><br/>
    用户邮箱 <input type="text" name="email" value="${user.email}"><br/>
    用户电话 <input type="text" name="phone" value="${user.phone}"><br/>
    密保问题<input type="text" name="question"value="${user.question}" ><br/>
    密保答案<input type="text" name="answer" value="${user.answer}"><br/>
    role<input type="text" name="role" value="${user.role}"><br/>
    ip <input type="text" name="ip" value="${user.ip}"><br/>
    <input type="submit" value="确定" >
</form>
</body>
</html>
