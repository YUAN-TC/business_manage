<html>
<#include "common/header.ftl">

<body>
<div id="wrapper" class="toggled">

<#--边栏sidebar-->
<#include "common/nav.ftl">

<#--主要内容content-->
    <div id="page-content-wrapper">
        <div class="container-fluid">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <form role="form"enctype="multipart/form-data" method="post" action="">
<#--                        <input type="hidden" name="id" value="${product.id}"><br/>-->
<#--                        类别id <input type="text" name="categoryId" value="${product.categoryId}"><br/>-->
<#--                        商品名称 <input type="text" name="name" value="${product.name}"><br/>-->
<#--                        商品副标题 <input type="text" name="subtitle"value="${product.subtitle}" ><br/>-->
<#--                        上传图片<img alt="无法显示图片" src="/Images/${product.mainImage}" height="100px" weight="100px"> <input type="file" name="image"><br/>-->
<#--                        <%--    产品主E图 <input type="text" name="mainImage" value="${product.mainImage}"><br/>--%>-->
<#--                        <%--    图片地址 <input type="text" name="subImages"value="${product.subImages}" ><br/>--%>-->
<#--                        商品详情 <input type="text" name="detail" value="${product.detail}"><br/>-->
<#--                        商品价格 <input type="text" name="price"value="${product.price}" ><br/>-->
<#--                        商品库存 <input type="text" name="stock" value="${product.stock}"><br/>-->
<#--                        商品状态 <input type="text" name="status" value="${product.status}"><br/>-->

                        <div class="form-group">
                            <input type="hidden" name="id" value="${product.id}"><br/>
                        </div>
                        <div class="form-group">
                            <label>商品名称</label>
                            <input name="name" type="text" class="form-control" value="${(product.name)!''}"/>
                        </div>
                        <div class="form-group">
                            <label>商品副标题</label>
                            <input name="subtitle" type="text" class="form-control" value="${(product.subtitle)!''}"/>
                        </div>
                        <div class="form-group">
                            <label>上传图片</label>
                            上传图片<img alt="无法显示图片" src="/Images/${product.mainImage}" height="100px" weight="100px"> <input type="file" name="image">
                        </div>
                        <div class="form-group">
                            <label>商品详情</label>
                            <input name="detail" type="text" class="form-control" value="${(product.detail)!''}"/>
                        </div>
                        <div class="form-group">
                            <label>商品价格</label>
                            <input name="price" type="text" class="form-control" value="${(product.price)!''}"/>
                        </div>
                        <div class="form-group">
                            <label>商品库存</label>
                            <input name="stock" type="text" class="form-control" value="${(product.stock)!''}"/>
                        </div>
                        <div class="form-group">
                            <label>商品状态</label>
                            <input name="status" type="text" class="form-control" value="${(product.status)!''}"/>
                        </div>
                        <div class="form-group">
                            <label>类目</label>
                            <select name="categoryId" class="form-control">
                                <#list categorylist as category>
                                    <option value="${category.id}"
                                            <#if (product.categoryId)?? && product.categoryId == category.id>
                                                selected
                                            </#if>
                                        >${category.name}
                                    </option>
                                </#list>
                            </select>
                        </div>

                        <button type="submit" class="btn btn-default">提交</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<#--<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>-->
<#--<script src="https://cdn.bootcss.com/bootstrap-fileinput/4.4.8/js/fileinput.min.js"></script>-->
<#--<script src="https://cdn.bootcss.com/bootstrap-fileinput/4.4.8/js/locales/zh.min.js"></script>-->
<#--<script>-->

<#--    $(function () {-->
<#--        var initialPreview = [];-->
<#--        if ('${(productInfo.productIcon)!""}' != '') {-->
<#--            initialPreview = "<img class='kv-preview-data file-preview-image' src='${(productInfo.productIcon)!""}'>"-->
<#--        }-->

<#--        $("#input-id").fileinput({-->
<#--            uploadUrl: '/sell/image/upload',-->
<#--            language: 'zh',-->
<#--            browseClass: "btn btn-primary btn-block",-->
<#--            showCaption: false,-->
<#--            showRemove: false,-->
<#--            showUpload: false,-->
<#--            allowedFileExtensions: [ 'jpg', 'jpeg', 'png', 'gif' ],-->
<#--            maxFileSize: 1024,-->
<#--            autoReplace: true,-->
<#--            overwriteInitial: true,-->
<#--            maxFileCount: 1,-->
<#--            initialPreview: initialPreview,-->
<#--        });-->
<#--    });-->
<#--    //上传完成设置表单内容-->
<#--    $('#input-id').on('fileuploaded', function(event, data, previewId, index) {-->
<#--        if (data.response.code != 0) {-->
<#--            alert(data.response.msg)-->
<#--            return-->
<#--        }-->
<#--        $('#productIcon').val(data.response.data.fileName)-->
<#--    });-->
<#--</script>-->
</body>
</html>