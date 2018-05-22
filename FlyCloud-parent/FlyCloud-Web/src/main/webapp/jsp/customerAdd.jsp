<%--
  Created by IntelliJ IDEA.
  User: Altman
  Date: 2018-05-05
  Time: 21:33
  添加客户窗口
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>

    <div class="col-md-6 col-sm-6 col-xs-6">
        <div class="x_panel">
            <div class="x_title">
                <h2> 添加客户 </h2>
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
                    action="${pageContext.request.contextPath}/customer/insertCustomer.action" method="post">
                    <input type="hidden" name="empId" value="${emp.empId}"/>
                    <input type="hidden" name="companyId" value="${emp.companyId}"/>
                    <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="customerName_add">客户姓名
                            <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input type="text" id="customerName_add" name="customerName" required="required"
                                   class="form-control col-md-7 col-xs-12">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="customerPhone_add">客户电话
                            <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input type="text" id="customerPhone_add" name="customerPhone"
                                   required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">客户性别
                            <span class="required">*</span>
                        </label>
                        <p style="margin-bottom: 0px;border-left-width: 0px;padding-left: 130px;padding-top: 5px;">
                            男:
                            <input type="radio" class="flat" name="customerSex" value="男" checked="" required />
                            女:
                            <input type="radio" class="flat" name="customerSex" value="女" />
                        </p>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">
                            客户类型&nbsp;<span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <select name="customerType" class="select2_single form-control" tabindex="-1">
                                <option value="1">个人</option>
                                <option value="2">公司</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">
                            客户生日<span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <div class="form-group">
                                <div class='input-group date customerBirthday_format'>
                                    <input id='customerBirthday_add' name="customerBirthday" type='text'
                                           class="form-control" />
                                    <span class="input-group-addon">
                                        <span class="glyphicon glyphicon-calendar"></span>
                                    </span>
                                </div>
                            </div>
                        </div>
                    </div>
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
