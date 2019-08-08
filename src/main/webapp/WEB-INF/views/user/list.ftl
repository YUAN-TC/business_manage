<html>
<#include  "common/header.ftl">

<body>
<div id="wrapper" class="toggled">

  <#--边栏sidebar-->
  <#include "common/nav.ftl">

  <#--主要内容content-->
  <div id="page-content-wrapper">
    <div class="container-fluid">
      <div class="row clearfix">
        <div class="col-md-12 column">
          <table class="table table-bordered table-condensed">
            <thead>
            <th>用户id</th>
            <th>用户姓名</th>
            <th>用户密码</th>
            <th>用户邮箱</th>
            <th>用户电话</th>
            <th>操作</th>
            </thead>
            <tbody>

            <#list userlist as user>

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
            </#list>
            </tbody>
          </table>
        </div>
      </div>
    </div>
  </div>

</div>
</body>
</html>