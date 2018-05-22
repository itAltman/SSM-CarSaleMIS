$(function () {
    var projectName = $('#projectName').attr('project');

    /*修改按钮*/
    $('.editEmpClick').click(function () {
        var valueId = $(this).attr('v');
        console.log(valueId);
        $('#empId_edit').val(valueId);

        $.getJSON(
            projectName + '/system/getEmployeeById.action',
            {empId: valueId},
            function (json) {
                var employee = json.employeeById;
                console.log(employee);
                $('#employeeName_edit').val(employee.empName);
                $('#employeePhone_edit').val(employee.empPhone);
                $('#employeeSalery_edit').val(employee.empSalery);
            });
    });

    /!*删除按钮*!/
    $('.deleteEmpClick').click(function () {
        var empId = $(this).attr('v');
        console.log(empId);
        $('#delEmpModelSubmit').attr('v',empId);
    });

    /!*确认删除按钮*!/
    $('#delEmpModelSubmit').click(function () {
        var empId = $(this).attr('v');
        var adminEmpId = $(this).attr('empId');
        location.href = projectName + "/system/deleteEmployeeById.action?adminEmpId=" + adminEmpId
            + "&empId=" + empId;
    });

});