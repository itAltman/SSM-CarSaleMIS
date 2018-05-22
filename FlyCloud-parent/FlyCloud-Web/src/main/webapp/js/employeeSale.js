$(function (){
    var projectName = $('#projectName').attr('project');
    var empId = $('#empId').attr('empId');
    var companyName = $('#companyName').attr('companyName');
    var myChart = echarts.init(document.getElementById("main"));
    var empName = Array();
    var pieData = Array();
    var AllData;
    //数组去重
    Array.prototype.unique2 = function(){
        this.sort(); //先排序
        var res = [this[0]];
        for(var i = 1; i < this.length; i++){
            if(this[i] !== res[res.length - 1]){
                res.push(this[i]);
            }
        }
        return res;
    }
    /*发送get请求获取雇员信息和销量*/
    /* ${pageContext.request.contextPath}/employeeSale/getEmployeeSaleCondition.action?empId=${emp.empId}*/
    $.getJSON(projectName+"/employeeSale/getEmployeeSaleCondition.action", { empId: empId }, function(json){
        console.log(json.employeeSale);
        var obj = json.employeeSale;
        AllData = json.employeeSale;
        $.each(obj, function (i, n) {
            empName.push(n.name);

        });
        //empName=empName.unique2();
        console.log('empName:  '+empName);
        console.log('AllData:  '+AllData);
        myChart.setOption(
            option = {
                title : {
                    text: companyName,
                    subtext: '员工销售图',
                    x:'center'
                },
                tooltip : {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    orient : 'vertical',
                    x : 'left',
                    data:empName
                },
                toolbox: {
                    show : true,
                    feature : {
                        mark : {show: true},
                        dataView : {show: true, readOnly: false},
                        magicType : {
                            show: true,
                            type: ['pie', 'funnel'],
                            option: {
                                funnel: {
                                    x: '25%',
                                    width: '50%',
                                    funnelAlign: 'left',
                                    max: 1548
                                }
                            }
                        },
                        restore : {show: true},
                        saveAsImage : {show: true}
                    }
                },
                calculable : true,
                series : [
                    {
                        name:'销量详情',
                        type:'pie',
                        radius : '55%',
                        center: ['50%', '60%'],
                        data:AllData
                    }
                ]
            }
        );
    });

});