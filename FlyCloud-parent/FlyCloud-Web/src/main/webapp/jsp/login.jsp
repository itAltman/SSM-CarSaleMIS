<%--
  Created by IntelliJ IDEA.
  User: Altman
  Date: 2018-04-20
  Time: 16:12
  登录界面
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>飞云汽车销售管理系统 </title>
    <!-- 自己的css -->
    <link href="../css/login.css" rel="stylesheet">

    <!-- Bootstrap -->
    <link href="../vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="../vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="../vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- Animate.css -->
    <link href="../vendors/animate.css/animate.min.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="../build/css/custom.min.css" rel="stylesheet">

</head>

<body class="login" id="login_page">
<div>
    <a class="hiddenanchor" id="signup"></a>
    <a class="hiddenanchor" id="signin"></a>

    <div class="login_wrapper">
        <div class="animate form login_form">
            <section class="login_content">
                <form>
                    <input id="projectName" type="hidden" project="${pageContext.request.contextPath}">
                    <h1>登&nbsp;&nbsp;录</h1>
                    <div>
                        <input id="CompanyName_login" type="text" class="form-control" placeholder="企业名称"
                               required="required" />
                    </div>
                    <div>
                        <select id="PositionName_login" class="form-control">
                            <option value="0">请选择职位名称</option>
                            <option value="1">经理</option>
                            <option value="2">操作员</option>
                        </select>
                    </div>
                    <br/>
                    <div>
                        <input id="EmpName_login" type="text" class="form-control" placeholder="员工名称"
                               required="required" />
                    </div>
                    <div>
                        <input id="PhoneNumber_login" type="text" class="form-control"
                               maxlength="11" placeholder="手机号码:请输入正确的11位手机号码"
                               required="required" />
                    </div>
                    <div>
                        <input id="Password_login" type="password" class="form-control" placeholder="登录密码"
                               required="required" />
                    </div>
                    <div>
                        <a id="but_login" class="btn btn-default">登录</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="#signup" class="to_register"> 注册 </a>
                    </div>

                    <div class="clearfix"></div>

                    <div class="separator">

                        <div class="clearfix"></div>
                        <br />

                        <div>
                            <h1><i class="fa fa-paw"></i> 飞云汽车销售管理系统</h1>
                            <p>©2018 All Rights Reserved.</p>
                        </div>
                    </div>
                </form>
            </section>
        </div>

        <div id="register" class="animate form registration_form">
            <section class="login_content">
                <form>
                    <h1>注&nbsp;&nbsp;册</h1>
                    <div>
                        <input id="CompanyName_register" type="text" class="form-control" placeholder="企业名称"
                               required="required" />
                    </div>
                    <div>
                        <input id="EmpName_register" type="text" class="form-control" placeholder="员工姓名"
                               required="required" />
                    </div>
                    <div>
                        <input id="PhoneNumber_register" type="text" class="form-control" placeholder="手机号码"
                               maxlength="11" required="required" />
                    </div>
                    <div>
                        <input id="Password_register" type="password" class="form-control" placeholder="登录密码"
                               required="required" />
                    </div>
                    <div>
                        <input id="authcode_input" type="text" class="form-control"  placeholder="验证码"
                               required="required" v=""/>
                        <button id="authcode_button" class="btn btn-primary">免费获取验证码</button>
                    </div>
                    <div>
                        <a id="btn_register" class="btn btn-default"> 注册 </a>
                    </div>

                    <div class="clearfix"></div>

                    <div class="separator">
                        <p class="change_link">已经有一个账号了 ?
                            <a href="#signin" class="to_register"> 登录 </a>
                        </p>

                        <div class="clearfix"></div>
                        <br />

                        <div>
                            <h1><i class="fa fa-paw"></i> 飞云汽车销售管理系统</h1>
                            <p>©2018 All Rights Reserved.</p>
                        </div>
                    </div>
                </form>
            </section>
        </div>
    </div>
</div>
</body>

<!-- 引入js文件 -->
<script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="../js/md5.js"></script>
<script type="text/javascript" src="../js/login.js"></script>
<script type="text/javascript" src="../js/register.js"></script>

</html>
