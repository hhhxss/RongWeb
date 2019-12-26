function met_onload(){
    init_kaihui_analysis()
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
                title: {
                    text: '堆叠区域图'
                },
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