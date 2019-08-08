<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/8/7
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>修改商品</h1>

<form action=""enctype="multipart/form-data"  method="post">
    <input type="hidden" name="id" value="${product.id}"><br/>
    类别id <input type="text" name="categoryId" value="${product.categoryId}"><br/>
    商品名称 <input type="text" name="name" value="${product.name}"><br/>
    商品副标题 <input type="text" name="subtitle"value="${product.subtitle}" ><br/>
    上传图片<img alt="无法显示图片" src="/Images/${product.mainImage}" height="100px" weight="100px"> <input type="file" name="image"><br/>
<%--    产品主图 <input type="text" name="mainImage" value="${product.mainImage}"><br/>--%>
<%--    图片地址 <input type="text" name="subImages"value="${product.subImages}" ><br/>--%>
    商品详情 <input type="text" name="detail" value="${product.detail}"><br/>
    商品价格 <input type="text" name="price"value="${product.price}" ><br/>
    商品库存 <input type="text" name="stock" value="${product.stock}"><br/>
    商品状态 <input type="text" name="status" value="${product.status}"><br/>
    <input type="submit" value="修改">
</form>
</body>
</html>
