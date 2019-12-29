function met_onload(){
    init_kaihui_analysis();
//首页图表 村镇雨量分布可视化
    init_io_vraindata();
    //首页图表 金桥镇雨量变化可视化
    init_io_jqrain();
}
function init_kaihui_analysis() {
    var kaihui_analysis = echarts.init(document.getElementById('kaihui_analysis'));
    $.ajax({
        type: "GET",
        url: "/api/iot/list",
        datatype: "JSON",
        success: function (data) {
            var pp_data = data.data;
            var x_data = new Array();
            var y_data1 = new Array();
            var y_data2 = new Array();
            for (i in pp_data) {
                if (pp_data[i].time == '') {
                    x_data.push('未知');
                } else {
                    x_data.push(pp_data[i].time);
                    y_data1.push(pp_data[i].data1);
                    y_data2.push(pp_data[i].data2);

                    /*var y = new Object();
                     y.name = bdsygroup_data[i].scategory;
                     y.value = parseInt(bdsygroup_data[i].bcount);
                     y_data.push(y);*/
                }
            }
            option = {
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
                    data:['雨量','水位']
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
                        name:'雨量',
                        type:'line',
                        stack: '总量',
                        areaStyle: {normal: {}},
                        data:y_data1
                    },
                    {
                        name:'水位',
                        type:'line',
                        stack: '总量',
                        label: {
                            normal: {
                                show: true,
                                position: 'top'
                            }
                        },
                        areaStyle: {normal: {}},
                        data:y_data2
                    }
                ]
            };
            kaihui_analysis.setOption(option);
        }
    });
}
function init_io_vraindata() {
    $.ajax({
        type: "GET",
        url: "/api/vraindata/rname",
        dataType: "json",
        success: function (data) {
            var vrain_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for( x in vrain_data){
                if(vrain_data[x].rname == ''){
                    x_data.push('未知');
                }else {
                    x_data.push(vrain_data[x].rname);
                }
            }
            for (y in vrain_data){
                y_data.push(vrain_data[y].id);
            }

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
                        data: y_data
                    }
                ]
            };
            io_vraindata.setOption(io_vraindata_option);

        }
    })
}
function init_io_jqrain() {
    $.ajax({
        type: "GET",
        url: "/api/jqrain/time",
        dataType: "json",
        success: function (data) {
            var jqrain_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for( x in jqrain_data){
                if(jqrain_data[x].time == ''){
                    x_data.push('未知');
                }else {
                    x_data.push(jqrain_data[x].time);
                }
            }
            for (y in jqrain_data){
                y_data.push(jqrain_data[y].data);
            }

            var io_jqrain = echarts.init(document.getElementById('io_jqrain'));
            io_jqrain_option = {
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'cross',
                        crossStyle: {
                            color: '#999'
                        }
                    }
                },
                toolbox: {
                    feature: {
                        dataView: {show: true, readOnly: false},
                        magicType: {show: true, type: ['line', 'bar']},
                        restore: {show: true},
                        saveAsImage: {show: true}
                    }
                },
                // legend: {
                //     data:['蒸发量','降水量','平均温度']
                // },
                xAxis: [
                    {
                        type: 'category',
                        data: x_data,
                        axisPointer: {
                            type: 'shadow'
                        }
                    }
                ],
                yAxis: [
                    {
                        type: 'value',
                        name: '水量',
                        min: 0,
                        max: 12,
                        interval: 2,
                        axisLabel: {
                            formatter: '{value} ml'
                        }
                    }
                ],
                series: [
                    {
                        name:'降水量',
                        type:'bar',
                        data:y_data
                    }
                ]
            };
            io_jqrain.setOption(io_jqrain_option);
        }
    })
}        