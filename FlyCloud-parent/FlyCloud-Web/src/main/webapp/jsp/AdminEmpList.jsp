<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Altman
  Date: 2018-05-03
  Time: 08:58
  经理权限的员工页面
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
                <input id="projectName" type="hidden" project="${pageContext.request.contextPath}">
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
                            <li><a><i class="fa fa-user"></i> 客户管理
                                <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li>
                                        <a href="${pageContext.request.contextPath}/customer/getAllCustomer.action?empId=${emp.empId}">
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
                            <li><a><i class="fa fa-bar-chart-o"></i>报表管理
                                <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu">
                                    <li><a href="${pageContext.request.contextPath}/employeeSale/getEmpId.action?empId=${emp.empId}">
                                        员工销量</a></li>
                                    <li ><a href="${pageContext.request.contextPath}/finance/getEmpId.action?empId=${emp.empId}">
                                        财务状况</a></li>
                                </ul>
                            </li>
                            <li class="active"><a><i class="fa fa-cog"></i> 系统管理
                                <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu" style="display: block;">
                                    <li class="current-page">
                                        <a href="${pageContext.request.contextPath}/system/getAllEmp.action?empId=${emp.empId}">
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

        <!-- page content -->
        <div class="right_col" role="main">
            <!--查询客户-开始-->
            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12">
                    <div class="x_panel">
                        <div class="x_title">
                            <h2>员工详细资料</h2>
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
                                    <th>员工姓名</th>
                                    <th>员工电话</th>
                                    <th>员工职位</th>
                                    <th>员工工资</th>
                                    <th>操作</th>
                                </tr>
                                </thead>

                                <tbody>
                                <c:forEach items="${employeeList}" var="employee">
                                    <tr>
                                        <td>${employee.empName}</td>
                                        <td>${employee.empPhone}</td>
                                        <td>${employee.position.positionName}</td>
                                        <td>¥${employee.empSalery}</td>
                                        <td>
                                            <button v="${employee.empId}"
                                                    class="btn btn-info btn-xs editEmpClick">修改
                                            </button>
                                            <button v="${employee.empId}"
                                                    data-toggle="modal" data-target="#employeeDelete"
                                                    class="btn btn-danger btn-xs deleteEmpClick">删除</button>
                                        </td>
                                    </tr>
                                </c:forEach>
                                <input type="hidden" v="${employeeList}">
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <!--查询客户-结束-->

            <div class="row">
                <!--添加客户-开始-->
                <%@include file="employeeAdd.jsp" %>
                <!--添加客户-结束-->

                <!--修改客户-开始-->
                <%@include file="employeeEdit.jsp" %>
                <!--修改客户-结束-->
            </div>
            <!-- 删除确认模式窗口 -->
            <%@include file="employeeDelete.jsp"%>
        </div>
        <!-- /page content -->

        <!-- footer content -->
        <%@include file="footer.jsp" %>
        <!-- /footer content -->

    </div>
</div>

<!-- jQuery -->
<script src="../vendors/jquery/dist/jquery.min.js"></script>

<!-- 引入js文件 -->
<script type="text/javascript" src="../js/employee.js"></script>

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
<%-- 时间 --%>
<!-- bootstrap-daterangepicker -->
<script src="../vendors/moment/min/moment.min.js"></script>
<script src="../vendors/bootstrap-daterangepicker/daterangepicker.js"></script>
<!-- bootstrap-datetimepicker -->
<script src="../vendors/bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"></script>


<!-- Custom Theme Scripts -->
<script src="../build/js/custom.min.js"></script>

</body>


</html>
