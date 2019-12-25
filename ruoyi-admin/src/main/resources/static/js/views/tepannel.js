function te_onload(){
    //首页图表 终端数据湿度可视化
    init_tel_humbygroup();

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
                if(tbygroup_data[x].grouptype == ''){
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