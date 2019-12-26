function sec_onload(){
    //首页图表 信息类型的可视化页面
    init_send_mbygroup();
}

function init_send_mbygroup() {
    $.ajax({
        type: "GET",
        url: "/api/sendmes/remark",
        dataType: "json",
        success:function(data) {
            var s_bygroup_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for (x in s_bygroup_data) {
                if (s_bygroup_data[x].smid == '') {
                    x_data.push('未知');
                } else {
                    x_data.push(s_bygroup_data[x].smid);
                }
            }
            for (y in s_bygroup_data) {
                y_data.push(s_bygroup_data[y].remark);
            }
            var send_mbygroup = echarts.init(document.getElementById('send_mbygroup'));
            option = {
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b}: {c} ({d}%)"
                },
                legend: {
                    orient: 'vertical',
                    x: 'left',
                    data:y_data
                },
                series: [
                    {
                        name:'发送信息类型',
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
                            {value:x_data[0], name:y_data[0]},
                            {value:x_data[1], name:y_data[1]},
                        ]
                    }
                ]
            };
            send_mbygroup.setOption(option);
        }
    })

}