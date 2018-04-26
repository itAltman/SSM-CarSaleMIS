$(function () {

    /*获取工程名称*/
    var projectName = $('#projectName').attr('project');
    console.log(projectName);

    var but_login = $('#but_login');//登录按钮
    var CompanyName_login = $('#CompanyName_login');//公司名称input

    /*异步判断企业名称是否存在*/
    $('#CompanyName_login').blur(function () {
        var companyName = $(this).val();
        console.log(companyName);

        /*ajax获取查询的json数据*/
        $.getJSON(projectName+'/user/isExistCompanyName.action',
            { companyName: companyName},function(json) {
            var resultName = json.resultName;
            if ("true"==resultName){
                //如果是true代表公司名称正确
                CompanyName_login.removeAttr("style");
                //解除按钮禁止
                but_login.attr('class','btn btn-default submit');

            } else {
                //如果是false代表公司名称错误
                CompanyName_login.attr('style','border: red 2px solid');
                //禁止提交按钮点击
                but_login.attr('class','btn btn-danger disabled');
            }
        });
    });


});