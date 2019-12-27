function m_onload(){
    init_area_water();
   //首页图表，福临村河流水位可视化
     init_fulin();

}
function init_area_water() {
    var area_water = echarts.init(document.getElementById('area_water'));
    $.ajax({
        type: "GET",
        url: "/api/iot/lis",
        datatype: "JSON",
        success: function (data_wa) {
            var pp_data = data_wa.data;
            var x_data = new Array();
            var y_data1 = new Array();
            var y_data2 = new Array();
                     for (i in pp_data) {
                if (pp_data[i].time == '') {
                    x_data.push('未知');
                } else {
                    x_data.push(pp_data[i].id);
                    y_data1.push(pp_data[i].rid);
                    y_data2.push(pp_data[i].data);

                    /*var y = new Object();
                     y.name = bdsygroup_data[i].scategory;
                     y.value = parseInt(bdsygroup_data[i].bcount);
                     y_data.push(y);*/
                }
            }


            option = {
                tooltip: {
                    axisPointer :{
                        label:{
                            show: true

                        }
                    }
                },
                visualMap: {
                    max: 260,
                    inRange: {
                        color: ['#CD3333','#FF3030', '#FF7F50', '#FFB90F','#FFF68F','#FFFF00']
                    }
                },
                xAxis3D: {
                    type : 'value'
                },
                yAxis3D: {
                    type : 'value'
                },
                zAxis3D: {
                    type: 'value'
                },
                grid3D: {
                    boxWidth: 200,
                    boxDepth: 80,
                    axisLabel: {
                        interval: 0
                    },
                    viewControl: {
                        // projection: 'orthographic'
                        autoRotate: true
                    },
                    light: {
                        main: {
                            intensity: 1.2,
                            shadow: true
                        },
                        ambient: {
                            intensity: 0.3
                        }
                    }
                },
                series: [{
                    type: 'bar3D',
                    data: [y_data2,x_data,y_data1],
                    shading: 'lambert',

                    label: {
                        textStyle: {
                            fontSize: 12,
                            borderWidth: 1
                        }
                    },

                    emphasis: {
                        label: {
                            textStyle: {
                                fontSize: 20,
                                color: '#900'
                            }
                        },
                        itemStyle: {
                            color: '#900'
                        }
                    }
                }]
            };
            area_water.setOption(option);

        }
    });
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




