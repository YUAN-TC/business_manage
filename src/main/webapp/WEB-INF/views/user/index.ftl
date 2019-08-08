<html>
<#include "../common/header.ftl">

<body>
<div id="wrapper" class="toggled">

  <#--边栏sidebar-->
  <#include "../common/nav.ftl">

  <#--主要内容content-->
  <div id="page-content-wrapper">
    <div class="container-fluid">
      <div class="row clearfix">
        <div class="col-md-12 column">
          <form role="form" method="post" action="">
<#--            <input type="hidden" name="id" value="${user.id}"><br/>-->
<#--            用户名称 <input type="text" name="username" value="${user.username}"><br/>-->
<#--            用户密码 <input type="text" name="password" value="${user.password}"><br/>-->
<#--            用户邮箱 <input type="text" name="email" value="${user.email}"><br/>-->
<#--            用户电话 <input type="text" name="phone" value="${user.phone}"><br/>-->
<#--            密保问题<input type="text" name="question"value="${user.question}" ><br/>-->
<#--            密保答案<input type="text" name="answer" value="${user.answer}"><br/>-->
<#--            role<input type="text" name="role" value="${user.role}"><br/>-->
<#--            ip <input type="text" name="ip" value="${user.ip}"><br/>-->

            <div class="form-group">
              <input name="id" type="hidden" class="form-control" value="${(user.id)!''}"/>
            </div>

            <div class="form-group">
              <label>用户名称</label>
              <input name="username" type="text" class="form-control" value="${(user.username)!''}"/>
            </div>
            <div class="form-group">
              <label>用户密码</label>
              <input name="password" type="text" class="form-control" value="${(user.password)!''}"/>
            </div>
            <div class="form-group">
              <label>用户邮箱</label>
              <input name="email" type="text" class="form-control" value="${(user.email)!''}"/>
            </div>
            <div class="form-group">
              <label>用户电话</label>
              <input name="phone" type="text" class="form-control" value="${(user.phone)!''}"/>
            </div>
            <div class="form-group">
              <label>密保问题</label>
              <input name="question" type="text" class="form-control" value="${(user.question)!''}"/>
            </div>
            <div class="form-group">
              <label>密保答案</label>
              <input name="answer" type="text" class="form-control" value="${(user.answer)!''}"/>
            </div>
            <div class="form-group">
              <label>role</label>
              <input name="role" type="text" class="form-control" value="${(user.role)!''}"/>
            </div>
            <div class="form-group">
              <label>ip地址</label>
              <input name="ip" type="text" class="form-control" value="${(user.ip)!''}"/>
            </div>

            <button type="submit" class="btn btn-default">提交</button>
          </form>
        </div>
      </div>
    </div>
  </div>

</div>
</body>
</html>