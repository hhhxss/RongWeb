function m_onload(){
    //首页图表，福临村河流水位可视化
     init_fulin();
}

    function init_fulin() {
    $.ajax({
        type: "GET",
        url: "/api/fulin/time",
        dataType: "json",
        success: function (data) {
            var flgroup_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for (x in flgroup_data) {
                x_data.push(flgroup_data[x].time);
            }
            for (y in flgroup_data) {
                y_data.push(flgroup_data[y].data);
            }
            var fulin_data = echarts.init(document.getElementById('fulin_data'));
            option = {
                color :'#655bcb',
                tooltip : {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'cross',
                        label: {
                            backgroundColor: '#6a7985'
                        }
                    }
                },
                legend: {
                    data:['河流水位']
                },
                toolbox: {
                    feature: {
                        saveAsImage: {}
                    }
                },
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                xAxis : [
                    {
                        type : 'category',
                        boundaryGap : false,
                        data : x_data
                    }
                ],
                yAxis : [
                    {
                        type : 'value'
                    }
                ],
                series : [
                    {
                        name:'河流水位',
                        type:'line',
                        stack: '总量',
                        areaStyle: {},
                        data:y_data
                    },

                ]
            };
            fulin_data.setOption(option);
        }
    });
}




