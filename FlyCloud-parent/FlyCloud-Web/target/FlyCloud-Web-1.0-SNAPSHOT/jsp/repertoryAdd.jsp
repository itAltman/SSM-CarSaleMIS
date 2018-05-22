<%--
  Created by IntelliJ IDEA.
  User: Altman
  Date: 2018-05-07
  Time: 16:26
  下订单页面
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<div class="col-md-6 col-sm-6 col-xs-6">
    <div class="x_panel">
        <div class="x_title">
            <h2> 下订单 </h2>
            <ul class="nav navbar-right panel_toolbox">
                <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
                        <i class="fa fa-wrench"></i></a>
                </li>
                <li><a class="close-link"><i class="fa fa-close"></i></a>
                </li>
            </ul>
            <div class="clearfix"></div>
        </div>
        <div class="x_content">
            <br/>
            <form id="addCustomer" data-parsley-validate class="form-horizontal form-label-left"
                  action="${pageContext.request.contextPath}/order/insertOrder.action" method="post">
                <input type="hidden" name="empId" value="${emp.empId}"/>
                <input type="hidden" name="companyId" value="${emp.companyId}"/>
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">
                        汽车品牌&nbsp;<span class="required">*</span>
                    </label>
                    <div class="col-md-6 col-sm-6 col-xs-12">
                        <select id="selectBrand" class="select2_single form-control"
                                tabindex="-1">
                            <option value="0" id="selectBrand_Option">-----请选择汽车品牌-----</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">
                        汽车车系&nbsp;<span class="required">*</span>
                    </label>
                    <div class="col-md-6 col-sm-6 col-xs-12">
                        <select id="selectSeries" class="select2_single form-control"
                                tabindex="-1">
                            <option value="0" id="selectSeries_Option">-----请选择汽车车系-----</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">
                        汽车名称&nbsp;<span class="required">*</span>
                    </label>
                    <div class="col-md-6 col-sm-6 col-xs-12">
                        <select id="selectCar" name="carId" class="select2_single form-control"
                                tabindex="-1">
                            <option value="0" id="selectCar_Option">-----请选择汽车名称-----</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12" for="carPrice">
                        汽车价格
                        <span class="required">*</span>
                    </label>
                    <div class="col-md-6 col-sm-6 col-xs-12">
                        <input type="text" id="carPrice" readonly="readonly"
                               required="required" class="form-control col-md-7 col-xs-12">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-md-3 col-sm-3 col-xs-12">采购数量
                        <span class="required">*</span>
                    </label>
                    <p id="orderNum_p" style="margin-bottom: 0px;border-left-width: 0px;padding-left: 130px;padding-top: 5px;">
                        1:
                        <input type="radio" class="flat" name="orderNum" value="1" checked="checked"/>
                        &nbsp;&nbsp;&nbsp;2:
                        <input type="radio" class="flat" name="orderNum" value="2"/>
                        &nbsp;&nbsp;&nbsp;3:
                        <input type="radio" class="flat" name="orderNum" value="3"/>
                    </p>
                </div>
                <input type="hidden" v="订单状态" name="orderType" value="1">
                <div class="ln_solid"></div>
                <div class="form-group">
                    <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-4">
                        <button type="submit" class="btn btn-success">提交</button>
                        <button type="reset" class="btn btn-primary">重置</button>
                    </div>
                </div>

            </form>
        </div>
    </div>
</div>



</body>
</html>
