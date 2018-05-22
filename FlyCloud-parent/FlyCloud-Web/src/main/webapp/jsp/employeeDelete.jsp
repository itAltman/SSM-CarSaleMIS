<%--
  Created by IntelliJ IDEA.
  User: Altman
  Date: 2018-05-06
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>

<!-- 信息删除确认模式窗口 -->
<div class="modal fade" id="employeeDelete">
    <div class="modal-dialog">
        <div class="modal-content message_align">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span></button>
                <h4 class="modal-title">提示信息！！！</h4>
            </div>
            <div class="modal-body">
                <h1 style="color:red; text-alien:center;">您确认要删除吗？</h1>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <a id="delEmpModelSubmit" v="" empId="${emp.empId}" class="btn btn-danger"
                   data-dismiss="modal">确定</a>
            </div>
        </div>
    </div>
</div>

</body>
</html>
