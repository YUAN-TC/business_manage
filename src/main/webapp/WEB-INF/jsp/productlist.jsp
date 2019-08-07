<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/8/7
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <th>类别id</th>
    <th>商品名称</th>
    <th>商品副标题</th>
    <th>产品主图</th>
    <th>商品详情</th>
    <th>商品价格</th>
    <th>商品库存</th>
    <th>商品状态</th>
    <th>操作</th>
    </thead>
    <c:forEach items="${productlist}" var="product">
        <tr>
            <th>${product.categoryId}</th>
            <th>${product.name}</th>
            <th>${product.subtitle}</th>
            <th>${product.mainImage}</th>
            <th>${product.detail}</th>
            <th>${product.price}</th>
            <th>${product.stock}</th>
            <th>${product.status}</th>
            <th>
                <a href="update/${product.id}">修改</a>

                <a href="delete/${product.id}">删除</a>
            </th>
        </tr>
    </c:forEach>
    <a href="insert">添加一个</a>
</table>


</body>
</html>
