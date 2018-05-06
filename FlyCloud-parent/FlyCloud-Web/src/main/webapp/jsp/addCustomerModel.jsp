<%--
  Created by IntelliJ IDEA.
  User: Altman
  Date: 2018-05-05
  Time: 21:33
  添加客户模式窗口
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<section id="container">
    <!--右边主要内容 开始-->
    <section class="wrapper site-min-height" style="margin-top: 10px;">
        <div class="col-md-6 col-sm-6 col-xs-12" style="margin-left: 30%; width: 40%">
            <div class="panel panel-info">
                <div class="panel-heading">添加商品</div>
                <div class="panel-body">
                    <form id="addCustomerModel" role="form" action="${pageContext.request.contextPath }/back/adminAddProductServlet">
                        <label>二级分类名称</label>
                        <input readonly="readonly" class="form-control" type="text" id="add_c_two_name" value="">
                        <br/>
                        <label>商品名称</label>
                        <input id="add_p_name" name="add_p_name" class="form-control" type="text" maxlength="30">
                        <br/>
                        <!-- <label>二级分类id</label>  -->
                        <input id="cid_add" name="add_cid_two_id" class="form-control" type="hidden" value="">

                        <!-- <label>商品状态</label>  -->
                        <input name="add_p_state" class="form-control" type="hidden" value="1">

                        <label>商品描述</label>
                        <input name="add_p_description" class="form-control" type="text" maxlength="50">
                        <br/>
                        <label>热点小标题</label>
                        <input name="add_p_hotTitle" class="form-control" type="text" maxlength="30" >
                        <br/>
                        <label>原始价格(限<b style="color:blue;">正整数和小数</b>，且小数点后最多只能2位)</label>
                        <input id="add_p_price" name="add_p_price" class="form-control" type="text" maxlength="8">
                        <span id="price_add"></span>
                        <br/>
                        <label><b style="color:red;">折后</b>价格(限<b style="color:blue;">正整数和小数</b>，且小数点后最多只能2位)</label>
                        <input id="add_p_currentPrice" name="add_p_currentPrice" class="form-control" type="text" maxlength="8">
                        <span id="currentPrice_add"></span>
                        <br/>
                        <label>库存</label>
                        <input id="add_p_stock" name="add_p_stock" class="form-control" type="text" maxlength="5">
                        <span id="stock_add"></span>
                        <br/>
                        <!-- 销量  -->
                        <input name="add_p_sales" class="form-control" type="hidden" value="0">

                        <!-- 管理员id  -->
                        <input name="add_manager_id" class="form-control" type="hidden" id" value="1">

                        <button id="addProduct_submit" type="submit" class="btn btn-info">提交</button>
                        <button data-dismiss="modal" class="btn btn-default" type="button">关闭</button>
                    </form>
                </div>
            </div>
        </div>
    </section>
</section>
</body>
</html>
