$(function () {
    var projectName = $('#projectName').attr('project');

    /*设置添加客户的生日格式*/
    $('.customerBirthday_format').datetimepicker({
        format: 'YYYY/MM/DD'
    });

    /*修改按钮*/
    $('.editClick').click(function () {
        var valueId = $(this).attr('v');
        console.log(valueId);
        $('#customerId_edit').val(valueId);

        $.getJSON(
            projectName + '/customer/getCustomerById.action',
            {customerId: valueId},
            function (json) {
                var customer = json.customer;
                console.log(customer);
                $('#customerName_edit').val(customer.customerName);
                $('#customerPhone_edit').val(customer.customerPhone);
                var sex = customer.customerSex;
                if ("男" == sex){
                    $('#customerSex_editF').parent().removeClass("checked");
                    $('#customerSex_editM').parent().addClass("checked");
                } else if ("女" == sex){
                    $('#customerSex_editM').parent().removeClass("checked");
                    $('#customerSex_editF').parent().addClass("checked");
                }
                $('#customerBirthday_edit').val(customer.birthdayFormat);
            });
    });
    
    /*删除按钮*/
    $('.deleteClick').click(function () {
        var customerId = $(this).attr('v');
        console.log(customerId);
        $('#delModelSubmit').attr('v',customerId);
    });

    /*确认删除按钮*/
    $('#delModelSubmit').click(function () {
        var customerId = $(this).attr('v');
        var empId = $(this).attr('empId');
        location.href = projectName + "/customer/deleteCustomerById.action?customerId=" + customerId
            + "&empId=" + empId;
    });
    
});