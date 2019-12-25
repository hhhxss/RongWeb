function met_onload(){

    //首页图表 村镇雨量分布可视化
    init_io_vraindata();

}

function init_io_vraindata() {
    $.ajax({
        type: "GET",
        url: "/api/vraindata/rname",
        dataType: "json",
        success: function (data) {
            var vrain_data = data.data;
            var x_data = new Array();
            //var y_data = new Array();
            for( x in vrain_data){
                if(vrain_data[x].parea == ''){
                    x_data.push('未知');
                }else {
                    x_data.push(vrain_data[x].rname);
                }
            }
            // for (y in vrain_data){
            //     y_data.push(vrain_data[y].rainavg);
            // }

            var io_vraindata = echarts.init(document.getElementById('io_vraindata'));
            io_vraindata_option = {
                color: ['#31a4d2'],
                tooltip : {
                    trigger: 'axis',
                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
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
                        data : x_data,
                        axisTick: {
                            alignWithLabel: true
                        }
                    }
                ],
                yAxis : [
                    {
                        type : 'value'
                    }
                ],
                series : [
                    {
                        name:'村镇雨量',
                        type:'bar',
                        barWidth: '60%',
                        data:[16.55, 17.06, 17.09, 16.30, 16.54, 16.46, 16.15,16.83,23.33,16.40,15.60,17.47,15.49,16.19,16.51,16.19,16.62,16.94,5.38]
                    }
                ]
            };
            io_vraindata.setOption(io_vraindata_option);

        }
    })
}
