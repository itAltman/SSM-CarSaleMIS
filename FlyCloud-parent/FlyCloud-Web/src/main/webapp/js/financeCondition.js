$(function (){
    var projectName = $('#projectName').attr('project');
    var empId = $('#empId').attr('empId');
    var myChart = echarts.init(document.getElementById("main"));
    var pay = new Array();
    var sale=new Array();
    var substract = new Array();
    /*发送get请求获取财务状况*/
    /* ${pageContext.request.contextPath}/finance/getFinanceCondition.action?empId=${emp.empId}*/
    $.getJSON(projectName+"/finance/getFinanceCondition.action", { empId: empId }, function(json){
        console.log(json.financeCondition);
        var obj = json.financeCondition;
        $.each(obj, function (i, n) {
            if(n.financingType=='1'){
                pay.push(n.financingMoney/10000);
            }else{
                sale.push(n.financingMoney/10000);

            }
            if(sale.length>12&&pay.length>12){
                return false;
            }
        });
       for(var i =0; i<12;i++){
           substract[i]=sale[i]-pay[i];
       }
        myChart.setOption(
            option = {
                tooltip : {
                    trigger: 'axis'
                },
                toolbox: {
                    show : true,
                    feature : {
                        mark : {show: true},
                        dataView : {show: true, readOnly: false},
                        magicType: {show: true, type: ['line', 'bar']},
                        restore : {show: true},
                        saveAsImage : {show: true}
                    }
                },
                calculable : true,
                legend: {
                    data:['收入','支出','利润']
                },
                xAxis : [
                    {
                        type : 'category',
                        data : ['4月','5月','6月','7月','8月','9月','10月','11月','12月','1月','2月','3月','4月','5月']
                    }
                ],
                yAxis : [
                    {
                        type : 'value',
                        name : '价格',
                        axisLabel : {
                            formatter: '{value} W'
                        }
                    },
                    {
                        type : 'value',
                        name : '利润',
                        axisLabel : {
                            formatter: '{value} W'
                        }
                    }
                ],
                series : [

                    {
                        name:'收入',
                        type:'bar',
                        data:sale
                    },
                    {
                        name:'支出',
                        type:'bar',
                        data:pay
                    },
                    {
                        name:'利润',
                        type:'line',
                        yAxisIndex: 1,
                        data:substract
                    }
                ]
            }
        );
    });
});