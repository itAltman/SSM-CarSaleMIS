<%--
  Created by IntelliJ IDEA.
  User: Altman
  Date: 2018-05-07
  Time: 14:58
  经理权限的付款查询
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
                                    <li><a href="${pageContext.request.contextPath}/customer/getAllCustomer.action?empId=${emp.empId}">
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
                            <li class="active"><a><i class="fa fa-cny"></i> 财务管理
                                <span class="fa fa-chevron-down"></span></a>
                                <ul class="nav child_menu" style="display: block;">
                                    <li><a href="${pageContext.request.contextPath}/order/getAllReceipt.action?empId=${emp.empId}">
                                        收款</a></li>
                                    <li class="current-page">
                                        <a href="${pageContext.request.contextPath}/order/getAllOrder.action?empId=${emp.empId}">
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

        <!-- page content -->
        <div class="right_col" role="main">
            <!--查询库存情况-开始-->
            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12">
                    <div class="x_panel">
                        <div class="x_title">
                            <h2>车辆库存情况</h2>
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
                                    <th>汽车名称</th>
                                    <th>汽车售价</th>
                                    <th>订购数量</th>
                                    <th>订单总价</th>
                                    <th>订单状态</th>
                                    <th>操作</th>
                                </tr>
                                </thead>

                                <tbody>
                                <c:forEach items="${carorderList}" var="carorder">
                                    <tr>
                                        <td>${carorder.car.carName}</td>
                                        <td>¥${carorder.car.carPrice}</td>
                                        <td>${carorder.orderNum}</td>
                                        <td>¥${carorder.orderTotalPrice}</td>
                                        <td>${carorder.getOrderTypeFormat()}</td>
                                        <td>
                                            <c:if test="${carorder.getOrderTypeFormat()=='未审核'}">
                                                <a href="${pageContext.request.contextPath}/order/updateOrderById.action?empId=${emp.empId}&orderId=${carorder.orderId}">
                                                    <button type="button" class="btn btn-info btn-xs">付款</button>
                                                </a>
                                            </c:if>
                                        </td>
                                    </tr>
                                </c:forEach>
                                <input type="hidden" v="${carorderList}">
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <!--查询库存情况-结束-->


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
<script type="text/javascript" src="../js/payment.js"></script>

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