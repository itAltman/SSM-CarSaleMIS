<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Altman
  Date: 2018-05-03
  Time: 08:58
  查询客户资料
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>飞云汽车销售管理系统 </title>

    <!-- Bootstrap -->
    <link href="../vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="../vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="../vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- iCheck -->
    <link href="../vendors/iCheck/skins/flat/green.css" rel="stylesheet">
    <!-- Datatables -->
    <link href="../vendors/datatables.net-bs/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="../vendors/datatables.net-buttons-bs/css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="../vendors/datatables.net-fixedheader-bs/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="../vendors/datatables.net-responsive-bs/css/responsive.bootstrap.min.css" rel="stylesheet">
    <link href="../vendors/datatables.net-scroller-bs/css/scroller.bootstrap.min.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="../build/css/custom.min.css" rel="stylesheet">
</head>

<body class="nav-md">
<div class="container body">
    <div class="main_container">
        <!-- Left menu -->
        <div class="col-md-3 left_col">
            <div class="left_col scroll-view">
                <div class="navbar nav_title" style="border: 0;">
                    <a class="site_title"><i class="fa fa-paw"></i> <span>飞云科技</span></a>
                </div>

                <div class="clearfix"></div>

                <!-- menu profile quick info -->
                <%@include file="userLeft.jsp" %>
                <!-- /menu profile quick info -->

                <br />

                <!-- sidebar menu -->
                <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                    <div class="menu_section">
                        <ul class="nav side-menu">
                            <li><a><i class="fa fa-home"></i> 主页消息 <span
                                    class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="${pageContext.request.contextPath}/login/goMain.action?empId=${emp.empId}">
                                        欢迎页</a></li>
                                </ul>
                            </li>
                            <li class="active"><a><i class="fa fa-user"></i> 客户管理
                                <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu" style="display: block;">
                                    <li class="current-page">
                                        <a href="${pageContext.request.contextPath}/customer/getAllCustomer.action?empId=${emp.empId}">
                                        客户资料</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-desktop"></i> 销售管理
                                <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="general_elements.html">车辆销售</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-th-list"></i> 库存管理
                                <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="tables.html">库存</a></li>
                                    <li><a href="tables_dynamic.html">采购</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-cny"></i> 财务管理
                                <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="chartjs.html">收款</a></li>
                                    <li><a href="chartjs2.html">付款</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-bar-chart-o"></i>报表管理
                                <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="fixed_sidebar.html">汽车销量</a></li>
                                    <li><a href="fixed_footer.html">员工销量</a></li>
                                    <li><a href="fixed_footer.html">财务状况</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-cog"></i> 系统管理
                                <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="chartjs.html">员工管理</a></li>
                                    <li><a href="chartjs2.html">日志信息</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>

                </div>
                <!-- /sidebar menu -->

            </div>
        </div>
        <!-- /Left menu -->

        <!-- top navigation -->
        <%@include file="userRight.jsp" %>
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12">
                    <div class="x_panel">
                        <div class="x_title">
                            <h2>客户详细资料</h2>
                            <a id="" class="btn btn-round btn-success" data-toggle="modal" data-target="#addCustomerModel">
                                <span class="glyphicon glyphicon-plus"></span>添加
                            </a>
                            <ul class="nav navbar-right panel_toolbox">
                                <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>
                                <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"
                                                        role="button" aria-expanded="false">
                                    <i class="fa fa-wrench"></i></a></li>
                                <li><a class="close-link"><i class="fa fa-close"></i></a></li>
                            </ul>
                            <div class="clearfix"></div>
                        </div>
                        <div class="x_content">
                            <table id="datatable-buttons" class="table table-striped table-bordered">
                                <thead>
                                <tr>
                                    <th>客户姓名</th>
                                    <th>客户电话</th>
                                    <th>客户性别</th>
                                    <th>客户类型</th>
                                    <th>客户生日</th>
                                    <th>创建时间</th>
                                    <th>操作</th>
                                </tr>
                                </thead>

                                <tbody>
                                <c:forEach items="${customerList}" var="customer">
                                    <tr>
                                        <td>${customer.customerName}</td>
                                        <td>${customer.customerPhone}</td>
                                        <td>${customer.customerSex}</td>
                                        <td>${customer.customerType}</td>
                                        <td>${customer.getBirthdayFormat()}</td>
                                        <td>${customer.getCreateTimeFormat()}</td>
                                        <td>
                                            <button class="btn btn-info">修改</button>
                                            <button class="btn btn-danger">删除</button>
                                        </td>
                                    </tr>
                                </c:forEach>
                                <<input type="hidden" v="customerList">
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- /page content -->

        <!-- footer content -->
        <%@include file="footer.jsp" %>
        <!-- /footer content -->

        <!-- 添加商品弹窗 -->
        <div class="modal fade" id="addProduct" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-body">
                <!--加载添加商品页面开始-->
                <div style="height: 260px;">
                    <%@include file="addCustomerModel.jsp" %>
                </div>
                <!--加载添加商品页面结束-->
            </div>
        </div>
    </div>
</div>

<!-- jQuery -->
<script src="../vendors/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="../vendors/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- FastClick -->
<script src="../vendors/fastclick/lib/fastclick.js"></script>
<!-- NProgress -->
<script src="../vendors/nprogress/nprogress.js"></script>
<!-- iCheck -->
<script src="../vendors/iCheck/icheck.min.js"></script>
<!-- Datatables -->
<script src="../vendors/datatables.net/js/jquery.dataTables.min.js"></script>
<script src="../vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
<script src="../vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
<script src="../vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
<script src="../vendors/datatables.net-buttons/js/buttons.flash.min.js"></script>
<script src="../vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>
<script src="../vendors/datatables.net-buttons/js/buttons.print.min.js"></script>
<script src="../vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
<script src="../vendors/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
<script src="../vendors/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
<script src="../vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
<script src="../vendors/datatables.net-scroller/js/dataTables.scroller.min.js"></script>
<script src="../vendors/jszip/dist/jszip.min.js"></script>
<script src="../vendors/pdfmake/build/pdfmake.min.js"></script>
<script src="../vendors/pdfmake/build/vfs_fonts.js"></script>

<!-- Custom Theme Scripts -->
<script src="../build/js/custom.min.js"></script>

</body>


</html>
