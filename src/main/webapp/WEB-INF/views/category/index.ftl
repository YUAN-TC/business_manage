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

<#--                        <input type="hidden" name="id" value="${category.id}"><br/>-->
<#--                        类别名称 <input type="text" name="name" value="${category.name}"><br/>-->
<#--                        所属父类 <input type="text" name="parentId" value="${category.parentId}"><br/>-->
<#--                        类别状态 <input type="text" name="status" value="${category.status}"><br/>-->

                        <div class="form-group">
                            <input name="id" type="hidden" class="form-control" value="${(category.id)!''}"/>
                        </div>

                        <div class="form-group">
                            <label>类别名称</label>
                            <input name="name" type="text" class="form-control" value="${(category.name)!''}"/>
                        </div>
                        <div class="form-group">
                            <label>所属父类</label>
                            <input name="parentId" type="text" class="form-control" value="${(category.parentId)!''}"/>
                        </div>
                        <div class="form-group">
                            <label>类别状态</label>
                            <input name="status" type="text" class="form-control" value="${(category.status)!''}"/>
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