$(document).ready(function () {

    /*获取工程名称*/
    var projectName = $('#projectName').attr('project');
    console.log(projectName);

    /*异步判断企业名称是否存在*/
    $('#CompanyName_login').blur(function () {
        var companyName = $(this).val();
        console.log(companyName);

        /*ajax获取查询的json数据*/
        $.getJSON(projectName+'/user/isExistCompanyName.action',
            { companyName: companyName}, function(json) {
            console.log(json.a);
        });
    });


});