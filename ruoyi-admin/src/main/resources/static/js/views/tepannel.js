function te_onload(){
    //首页图表 终端数据湿度可视化
    init_tel_humbygroup();

    //首页图表 终端数据温度可视化
    init_tel_tempbygroup();

    //首页图表 终端数据电压可视化
    init_tel_elebygroup();

}
function init_tel_elebygroup(){
    $.ajax({
        type: "GET",
        url: "/api/terminalsdata/ele",
        dataType: "json",
        success:function(data) {
            var e_bygroup_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for (x in e_bygroup_data) {
                if (e_bygroup_data[x].id == '') {
                    x_data.push('未知');
                } else {
                    x_data.push(e_bygroup_data[x].id);
                }
            }
            for (y in e_bygroup_data) {
                y_data.push(e_bygroup_data[y].ele);
            }
            var tel_elebygroup = echarts.init(document.getElementById('tel_elebygroup'));
            option = {
                xAxis: {
                    type: 'category',
                    boundaryGap: false,
                    data: x_data
                },
                yAxis: {
                    type: 'value'
                },
                series: [{
                    data: y_data,
                    type: 'line',
                    areaStyle: {}
                }]
            };
            tel_elebygroup.setOption(option);
        }
        })
}

function init_tel_tempbygroup() {
    $.ajax({
        type: "GET",
        url: "/api/terminalsdata/temp",
        dataType: "json",
        success:function(data){
            var p_bygroup_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for( x in p_bygroup_data){
                if(p_bygroup_data[x].id == ''){
                    x_data.push('未知');
                }else{
                    x_data.push(p_bygroup_data[x].id);
                }
            }
            for( y in p_bygroup_data){
                y_data.push(p_bygroup_data[y].temp);
            }
            var tel_bygroup = echarts.init(document.getElementById('tel_bygroup'));
            option = {
                title: {
                    text: 'Step Line'
                },
                tooltip: {
                    trigger: 'axis'
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
                    data: x_data
                },
                yAxis: {
                    type: 'value'
                },
                series: [
                    {
                        name:'Step End',
                        type:'line',
                        step: 'end',
                        data:y_data
                    }
                ]
            };
            tel_bygroup.setOption(option);
        }
    });

}
function init_tel_humbygroup() {
    $.ajax({
        type: "GET",
        url: "/api/terminalsdata/hum",
        dataType: "json",
        success:function (data){
            var tbygroup_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for( x in tbygroup_data){
                if(tbygroup_data[x].id == ''){
                    x_data.push('未知');
                }else{
                    x_data.push(tbygroup_data[x].id);
                }
            }
            for( y in tbygroup_data){
                y_data.push(tbygroup_data[y].hum);
            }
            var tel_humbygroup = echarts.init(document.getElementById('tel_humbygroup'));
            option = {
                xAxis: {
                    type: 'category',
                    data: x_data
                },
                yAxis: {
                    type: 'value'
                },
                series: [{
                    data: y_data,
                    type: 'line',
                    symbol: 'triangle',
                    symbolSize: 20,
                    lineStyle: {
                        normal: {
                            color: 'green',
                            width: 4,
                            type: 'dashed'
                        }
                    },
                    itemStyle: {
                        normal: {
                            borderWidth: 3,
                            borderColor: 'yellow',
                            color: 'blue'
                        }
                    }
                }]
            };
            tel_humbygroup.setOption(option);
        }
    })

}