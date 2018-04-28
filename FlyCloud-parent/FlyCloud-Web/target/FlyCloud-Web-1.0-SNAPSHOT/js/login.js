$(function () {

    /*获取工程名称*/
    var projectName = $('#projectName').attr('project');
    console.log(projectName);

    var but_login = $('#but_login');//登录按钮
    var CompanyName_login = $('#CompanyName_login');//公司名称
    var EmpName_login = $('#EmpName_login');//员工名称
    var PhoneNumber_login = $('#PhoneNumber_login');//员工电话


    /*异步判断企业名称是否存在*/
    $('#CompanyName_login').blur(function () {
        var companyName = $(this).val();
        console.log(companyName);

        /*ajax获取查询的json数据*/
        $.getJSON(
            projectName + '/login/isExistCompanyName.action',
            {companyName: companyName},
            function (json) {
                var resultName = json.resultName;
                if ("true" == resultName) {
                    //如果是true代表公司名称正确
                    CompanyName_login.removeAttr("style");
                    //解除按钮禁止
                    but_login.attr('class', 'btn btn-default submit');

                } else {
                    //如果是false代表公司名称错误
                    CompanyName_login.attr('style', 'border: red 2px solid');
                    //禁止提交按钮点击
                    but_login.attr('class', 'btn btn-danger disabled');
                }
            });
    });

    /*异步判断员工姓名是否正确*/
    $('#EmpName_login').blur(function () {
        var empName = $(this).val();
        console.log(empName);

        /*ajax获取查询的json数据*/
        $.getJSON(
            projectName + '/login/isExistEmpName.action',
            {empName: empName},
            function (json) {
                var resultName = json.resultName;
                if ("true" == resultName) {
                    //如果是true代表员工名称正确
                    EmpName_login.removeAttr("style");
                    //解除按钮禁止
                    but_login.attr('class', 'btn btn-default submit');

                } else {
                    //如果是false代表员工名称错误
                    EmpName_login.attr('style', 'border: red 2px solid');
                    //禁止提交按钮点击
                    but_login.attr('class', 'btn btn-danger disabled');
                }
            });
    });

    /*异步判断员工电话是否正确*/
    $('#PhoneNumber_login').blur(function () {
        var empPhone = $(this).val();
        console.log(empPhone);

        /*ajax获取查询的json数据*/
        $.getJSON(
            projectName + '/login/isExistEmpName.action',
            {empPhone: empPhone},
            function (json) {
                var resultName = json.resultName;
                if ("true" == resultName) {
                    //如果是true代表员工名称正确
                    PhoneNumber_login.removeAttr("style");
                    //解除按钮禁止
                    but_login.attr('class', 'btn btn-default submit');

                } else {
                    //如果是false代表员工名称错误
                    PhoneNumber_login.attr('style', 'border: red 2px solid');
                    //禁止提交按钮点击
                    but_login.attr('class', 'btn btn-danger disabled');
                }
            });
    });

});