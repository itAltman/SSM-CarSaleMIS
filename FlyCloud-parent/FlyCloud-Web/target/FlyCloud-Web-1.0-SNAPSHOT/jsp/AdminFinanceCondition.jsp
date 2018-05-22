<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-05-09
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>财务状况</title>
    <!-- Bootstrap -->
    <link href="../vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="../vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="../vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- iCheck -->
    <link href="../vendors/iCheck/skins/flat/green.css" rel="stylesheet">

    <!-- bootstrap-progressbar -->
    <link href="../vendors/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet">
    <!-- JQVMap -->
    <link href="../vendors/jqvmap/dist/jqvmap.min.css" rel="stylesheet"/>
    <!-- bootstrap-daterangepicker -->
    <link href="../vendors/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">
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
                    <a href="${pageContext.request.contextPath}/jsp/AdminMain.jsp" class="site_title">
                        <i class="fa fa-paw"></i> <span>飞云科技</span></a>
                </div>

                <div class="clearfix"></div>

                <input id="AAA" type="hidden" v="${emp}">

                <!-- menu profile quick info -->
                <%@include file="userLeft.jsp" %>
                <!-- /menu profile quick info -->

                <br />

                <!-- sidebar menu -->
                <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                    <div class="menu_section">
                        <ul class="nav side-menu">
                            <li ><a><i class="fa fa-home"></i> 主页消息 <span
                                    class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu" >
                                    <li ><a
                                            href="${pageContext.request.contextPath}/login/goMain.action?empId=${emp.empId}">
                                        欢迎页</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-user"></i> 客户管理
                                <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a
                                            href="${pageContext.request.contextPath}/customer/getAllCustomer.action?empId=${emp.empId}">
                                        客户资料</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-desktop"></i> 销售管理
                                <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="${pageContext.request.contextPath}/sale/getAllSale.action?empId=${emp.empId}">
                                        车辆销售</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-th-list"></i> 库存管理
                                <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="${pageContext.request.contextPath}/repertory/getAllRepertory.action?empId=${emp.empId}">
                                        车辆库存</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-cny"></i> 财务管理
                                <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="${pageContext.request.contextPath}/order/getAllReceipt.action?empId=${emp.empId}">
                                        收款</a></li>
                                    <li><a href="${pageContext.request.contextPath}/order/getAllOrder.action?empId=${emp.empId}">
                                        付款</a></li>
                                </ul>
                            </li>
                            <li class="active"><a><i class="fa fa-bar-chart-o"></i>报表管理
                                <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu" style="display: block;">
                                    <li><a href="${pageContext.request.contextPath}/employeeSale/getEmpId.action?empId=${emp.empId}">
                                        员工销量</a></li>
                                    <li class="current-page"><a href="${pageContext.request.contextPath}/finance/getEmpId.action?empId=${emp.empId}">
                                        财务状况</a></li>
                                </ul>
                            </li>
                            <li><a><i class="fa fa-cog"></i> 系统管理
                                <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="${pageContext.request.contextPath}/system/getAllEmp.action?empId=${emp.empId}">
                                        员工管理</a></li>
                                    <li><a href="${pageContext.request.contextPath}/system/getAllLog.action?empId=${emp.empId}">
                                        日志信息</a></li>
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
        <input id="projectName" type="hidden" project="${pageContext.request.contextPath}">
        <input id="empId" type="hidden" empId="${emp.empId}">
        <div class="right_col" role="main">
            <div id="main" style="width: 900px;height:550px;"></div>
        </div>
        <!-- footer content -->
        <%@include file="footer.jsp" %>
        <!-- /footer content -->
</body>
<!-- jQuery -->
<script src="../vendors/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="../vendors/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- FastClick -->
<script src="../vendors/fastclick/lib/fastclick.js"></script>

<!-- Custom Theme Scripts -->
<script src="../build/js/custom.min.js"></script>
<script src="../js/financeCondition.js"></script>
<script src="../js/echarts.js"></script>
</html>
