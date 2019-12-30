function m_onload(){
//首页图表 泉塘街道水位走势可视化
    init_quantang();
//首页图表 安山镇温度走势可视化
    init_anshan();
//首页图表 路口镇温度走势可视化
    init_lukou();
//首页图表 各水库水位走势可视化
    init_water();
}
function init_quantang(){
    $.ajax({
        type: "GET",
        url: "/api/qtdata/time",
        dataType: "json",
        success: function (data) {
            var quantang_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for (x in quantang_data) {
                x_data.push(quantang_data[x].time);
            }
            for (y in quantang_data) {
                y_data.push(quantang_data[y].data);
            }
            var quantang_data = echarts.init(document.getElementById('quantang_data'));
            init_quantang_option = {
                tooltip: {
                    trigger: 'axis'
                },
                legend: {
                    data:['泉塘街道','湘龙街道','星沙街道']
                },
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                toolbox: {
                    feature: {
                        saveAsImage: {}
                    }
                },
                xAxis: {
                    type: 'category',
                    boundaryGap: false,
                    data:x_data
                },
                yAxis: {
                    type: 'value'
                },
                series: [
                    {
                        name:'泉塘街道',
                        type:'line',
                        stack: '总量',
                        data:y_data
                    },
                    {
                        name:'湘龙街道',
                        type:'line',
                        stack: '总量',
                        data:y_data
                    },
                    {
                        name:'星沙街道',
                        type:'line',
                        stack: '总量',
                        data:y_data
                    },
                ]
            };
            quantang_data.setOption(init_quantang_option);
        }
    })

}

function init_anshan() {
    $.ajax({
        type: "GET",
        url: "/api/anshandata/time",
        dataType: "json",
        success: function (data) {
            var anshan_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for (x in anshan_data) {
                x_data.push(anshan_data[x].time);
            }
            for (y in anshan_data) {
                y_data.push(anshan_data[y].data);
            }
            var anshan_data = echarts.init(document.getElementById('anshan_data'));
            init_anshan_option = {
                color: ['#00fc1a'],
                tooltip: {
                    trigger: 'axis'
                },
                toolbox: {
                    show: true,
                    feature: {
                        magicType: {show: true, type: ['line','bar']},
                    }
                },
                calculable: true,
                grid: {
                    left: '3%',
                    right: '3%',
                    top: '5%',
                    bottom: '0%',
                    containLabel: true
                },
                xAxis: [
                    {
                        type: 'category',
                        boundaryGap: false,
                        data: x_data
                    }
                ],
                yAxis: [
                    {
                        type: 'value',
                        axisLabel: {
                            formatter: '{value} °C'
                        }
                    }
                ],
                series: [
                    {
                        type: 'line',
                        data: y_data,

                    }
                ]
            };
            anshan_data.setOption(init_anshan_option);
        }
    });
}

function init_lukou() {
    $.ajax({
        type: "GET",
        url: "/api/lukoudata/time",
        dataType: "json",
        success: function (data) {
            var lukou_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for (x in lukou_data) {
                x_data.push(lukou_data[x].time);
            }
            for (y in lukou_data) {
                y_data.push(lukou_data[y].data);
            }
            var lukou_data = echarts.init(document.getElementById('lukou_data'));
            init_lukou_option = {
                color: ['#675bba'],
                tooltip: {
                    trigger: 'axis'
                },
                toolbox: {
                    show: true,
                    feature: {
                        magicType: {show: true, type: ['line','bar']},
                    }
                },
                calculable: true,
                grid: {
                    left: '3%',
                    right: '3%',
                    top: '5%',
                    bottom: '0%',
                    containLabel: true
                },
                xAxis: [
                    {
                        type: 'category',
                        boundaryGap: false,
                        data: x_data
                    }
                ],
                yAxis: [
                    {
                        type: 'value',
                        axisLabel: {
                            formatter: '{value} °C'
                        }
                    }
                ],
                series: [
                    {
                        type: 'line',
                        data: y_data,

                    }
                ]
            };
            lukou_data.setOption(init_lukou_option);
        }
    });
}

function init_water() {
    $.ajax({
        type: "GET",
        url: "/api/waterdata/rname",
        dataType: "json",
        success: function (data) {
            var water_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for (x in water_data) {
                x_data.push(water_data[x].rname);
            }
            for (y in water_data) {
                y_data.push(water_data[y].data);
            }
            var water_data = echarts.init(document.getElementById('water_data'));
            init_water_option={
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b}: {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    x: 'left',
                    data:x_data
                },
                series: [
                    {
                        name:'访问来源',
                        type:'pie',
                        radius: ['50%', '70%'],
                        avoidLabelOverlap: false,
                        label: {
                            normal: {
                                show: false,
                                position: 'center'
                            },
                            emphasis: {
                                show: true,
                                textStyle: {
                                    fontSize: '30',
                                    fontWeight: 'bold'
                                }
                            }
                        },
                        labelLine: {
                            normal: {
                                show: false
                            }
                        },
                        data:[
                            {value:y_data[0], name:'乌江水库'},
                            {value:y_data[1], name:'付安水库'},
                            {value:y_data[2], name:'关山水库'},
                            {value:y_data[3], name:'北山水库'},
                            {value:y_data[4], name:'响水坝水库'}
                        ]
                    }
                ]
        };
            water_data.setOption(init_water_option);
            }
            });
}
