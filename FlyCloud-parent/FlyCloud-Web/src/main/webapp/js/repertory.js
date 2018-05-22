$(function () {
    var projectName = $('#projectName').attr('project');

    /*ajax获取汽车品牌的json数据*/
    $.getJSON(
        projectName + '/order/getAllCarBrand.action',
        function (json) {
            var carbrandList = json.carbrandList;
            console.log(carbrandList);

            for (var i = 0; i < carbrandList.length; i++ ) {
                var carbrand = carbrandList[i];
                console.log(carbrand);
                var option = "<option value='" + carbrand.brandId + "' char='" + carbrand.brandNum + "'>" +
                    carbrand.brandName + "</option>";
                $("#selectBrand").append(option);
            }
        });

    /*汽车品牌下拉框改变事件*/
    $('#selectBrand').change(function() {
        var brandId = $(this).val();
        $('#selectSeries option:gt(0)').remove();
        $('#selectCar option:gt(0)').remove();
        /*ajax获取汽车车系的json数据*/
        $.getJSON(
            projectName + '/order/getAllCarSeries.action',
            {brandId:brandId},
            function (json) {
                var carseriesList = json.carseriesList;
                console.log(carseriesList);

                for (var i = 0; i < carseriesList.length; i++ ) {
                    var carseries = carseriesList[i];
                    console.log(carseries);

                    if (carseries.brandId == brandId){
                        var option = "<option value='" + carseries.seriesId + "'>" +
                            carseries.seriesName + "</option>";
                        $('#selectSeries').append(option);
                    }
                }
            });
    });

    /*汽车车系下拉框改变事件*/
    $('#selectSeries').change(function() {
        var seriesId = $(this).val();
        $('#selectCar option:gt(0)').remove();
        /*ajax获取汽车车系的json数据*/
        $.getJSON(
            projectName + '/order/getAllCar.action',
            {seriesId:seriesId},
            function (json) {
                var carList = json.carList;
                console.log(carList);

                for (var i = 0; i < carList.length; i++ ) {
                    var car = carList[i];
                    console.log(car);

                    if (car.seriesId == seriesId){
                        var option = "<option value='" + car.carId + "'>" +
                            car.carName + "</option>";
                        $('#selectCar').append(option);
                    }
                }
            });

    });

    /*汽车名称变动*/
    $('#selectCar').change(function() {
        var carId = $(this).val();
        $.getJSON(
            projectName + '/order/getCarPriceById.action',
            {carId:carId},
            function (json) {
                var carById = json.carById;
                console.log(carById);

                var carPrice = carById.carPrice;
                if (carPrice == null) {
                    $('#carPrice').val('0');
                } else {
                    $('#carPrice').val(carPrice);
                }
            });
    });

});