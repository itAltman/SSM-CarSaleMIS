<%--
  Created by IntelliJ IDEA.
  User: Altman
  Date: 2018-05-03
  Time: 09:11
  用户左上角，图片和姓名
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="profile clearfix">

    <div class="profile_pic">
        <img src="../images/img.jpg" alt="..." class="img-circle profile_img">
    </div>
    <div class="profile_info">
        <span>欢迎您,</span>
        <h2>${emp.empName} ！</h2>
    </div>
    <div>&nbsp;&nbsp;&nbsp;&nbsp;${emp.company.companyName}</div>

</div>
