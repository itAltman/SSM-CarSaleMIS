<%--
  Created by IntelliJ IDEA.
  User: Altman
  Date: 2018-05-03
  Time: 09:15
  用户右上角，姓名
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="top_nav">
    <div class="nav_menu">
        <nav>
            <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
            </div>

            <ul class="nav navbar-nav navbar-right">
                <li class="">
                    <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                        <img src="../images/img.jpg" alt="">${emp.empName}
                        <span class=" fa fa-angle-down"></span>
                    </a>
                    <ul class="dropdown-menu dropdown-usermenu pull-right">
                        <li><a href="javascript:;"> 个人信息</a></li>
                        <li><a href="${pageContext.request.contextPath}/jsp/login.jsp"><i
                                class="fa fa-sign-out pull-right"></i>
                            退出登录</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
    </div>
</div>
