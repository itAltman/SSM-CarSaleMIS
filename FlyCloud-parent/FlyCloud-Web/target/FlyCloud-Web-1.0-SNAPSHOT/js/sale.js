$(function () {
    var projectName = $('#projectName').attr('project');
    console.log(projectName);

    var companyId = $('#saleCompany').val();

    /*购车客户输入框失去焦点事件 判断是否存在*/
    $('#saleCustomerName').blur(function () {
        var customerPhone = $(this).val();
        console.log(customerPhone);

        /*ajax获取查询的json数据*/
        $.getJSON(
            projectName + '/sale/getCustomerByPhone.action',
            {customerPhone: customerPhone},
            function (json) {
                var customerList = json.customerList;
                console.log(customerList);
                if (customerList.length > 0) {
                    //如果是true代表公司名称正确
                    $(this).removeAttr("style");
                    //解除按钮禁止
                    $('#saleButtonSubmit').attr('class', 'btn btn-success submit');
                    var customer = customerList[0];
                    console.log(customer);
                    $('#saleCustomerId').val(customer.customerId);
                } else {
                    //如果是false代表公司名称错误
                    $(this).attr('style', 'border: red 2px solid');
                    //禁止提交按钮点击
                    $('#saleButtonSubmit').attr('class', 'btn btn-danger disabled');
                }
            });
    });

    /*获取所有库存的车辆*/
    $.getJSON(
        projectName + '/sale/getAllRepertoryCarName.action',
        {companyId: companyId},
        function (json) {
            var repertoryList = json.repertoryList;
            console.log(repertoryList);
            //将所有库存的汽车展现在下拉框中
            for (var i = 0; i < repertoryList.length; i++ ) {
                var repertoryCar = repertoryList[i];
                console.log(repertoryCar);
                var option = "<option value='" + repertoryCar.carId  +"' seriesId='" + repertoryCar.car.seriesId +
                    "'purchasePrice='" + repertoryCar.purchasePrice + "'>" +
                    repertoryCar.car.carName + "</option>";
                $("#saleSelectBrand").append(option);
            }
        });
    
    /*汽车名称变动事件*/
    $('#saleSelectBrand').change(function () {
        var seriesId = $("#saleSelectBrand option:selected").attr('seriesId');
        var purchasePrice = $("#saleSelectBrand option:selected").attr('purchasePrice');
        console.log(seriesId);
        console.log(purchasePrice);
        //清空车系和品牌
        $('#saleCarSeries').val('');
        $('#saleCarBrand').val('');
        $('#saleCurPrice').val('');

        /*ajax获取汽车车系的json数据*/
        $.getJSON(
            projectName + '/sale/getCarSeriesById.action',
            {seriesId:seriesId},
            function (json) {
                var carseriesById = json.carseriesById;
                console.log(carseriesById);

                $('#saleCarSeries').val(carseriesById.seriesName);
                $('#saleCarBrand').val(carseriesById.carbrand.brandName);
                $('#saleCurPrice').val(purchasePrice);

            });

    });

    /*根据公司编号查询销售员工*/
    $.getJSON(
        projectName + '/sale/getAllEmpByCompanyId.action',
        {companyId: companyId},
        function (json) {
            var employeeList = json.employeeList;
            console.log(employeeList);
            //将所有销售人员展现在下拉框中
            for (var i = 0; i < employeeList.length; i++ ) {
                var employee = employeeList[i];
                console.log(employee);
                var option = "<option value='" + employee.empId + "'>" +
                    employee.empName + "</option>";
                $("#saleEmpId").append(option);
            }
        });
});