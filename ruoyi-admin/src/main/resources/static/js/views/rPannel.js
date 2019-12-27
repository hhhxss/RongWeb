function r_onload() {
//首页图表 山洪全部可视化
    init_rvis();
    init_termi_dt()
   
    init_area_rbygroup();
    //首页图表 开慧村雨水走势可视化
    init_rain();
}
function init_rain(){
    $.ajax({
        type: "GET",
        url: "/api/raindata/time",
        dataType: "json",
        success: function (data) {
            var rain_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for (x in rain_data) {
                x_data.push(rain_data[x].time);
            }
            for (y in rain_data) {
                y_data.push(rain_data[y].data);
            }
            var rain_data = echarts.init(document.getElementById('rain_data'));
            init_rain_option = {

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

            rain_data.setOption(init_rain_option);
        }
    })
}
function init_area_rbygroup() {
    var area_rbygroup = echarts.init(document.getElementById('area_rbygroup'));
    $.ajax({
        type: "GET",
        url: "/api/rivervis/list",
        datatype: "JSON",
        success: function (data) {
            var pp_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for (i in pp_data) {
                if (pp_data[i].aname == '') {
                    x_data.push('未知');
                } else {
                    x_data.push(pp_data[i].aname);
                    y_data.push(pp_data[i].data);
                    /*var y = new Object();
                     y.name = bdsygroup_data[i].scategory;
                     y.value = parseInt(bdsygroup_data[i].bcount);
                     y_data.push(y);*/
                }
            }
            option = {
                angleAxis: {},
                radiusAxis: {
                    type: 'category',
                    data: x_data,
                    z: 10
                },
                polar: {},
                series: [{
                    type: 'bar',
                    data: y_data,
                    coordinateSystem: 'polar',
                    name: 'A',
                    stack: 'a'
                }],
                legend: {
                    show: true,
                    data: ['山洪预警']
                }
            };
            area_rbygroup.setOption(option);
        }
    });
}
function init_termi_dt(){
    var termi_dt = echarts.init(document.getElementById('termi_dt'));
    $.ajax({
        type: "GET",
        url: "/api/rivervis/all",
        datatype: "JSON",
        success: function (data_ter) {
            var pp_data = data_ter.data;
            var x_data = new Array();
            var y_data1 = new Array();
            var y_data2 = new Array();
            for (i in pp_data) {
                if (pp_data[i].time == '') {
                    x_data.push('未知');
                } else {
                    x_data.push(pp_data[i].hum);
                    y_data1.push(pp_data[i].temp);
                    y_data2.push(pp_data[i].ele);

                    /*var y = new Object();
                     y.name = bdsygroup_data[i].scategory;
                     y.value = parseInt(bdsygroup_data[i].bcount);
                     y_data.push(y);*/
                }
            }


            termioption = {
                title: {
                    text: '三维可旋转图'
                },
                tooltip: {
                    axisPointer :{
                        label:{
                            show: true

                        }
                    }
                },
                visualMap: {
                    max: 25,
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
                                color: '#1210ff'
                            }
                        },
                        itemStyle: {
                            color: '#17ff6a'
                        }
                    }
                }]
            };
            termi_dt.setOption(termioption);

        }
    });

}

function init_rvis() {
    $.ajax({
        type: "GET",
        url: "/api/rivervis/commentCount",
        dataType: "json",
        success: function (data_bt) {
            var pre_data = data_bt.data;
            var rain = new Array();
            var flow = new Array();
            var wlevel = new Array();
            var ph = new Array();
            var pm = new Array();
            var temp = new Array();
            var hum = new Array();
            var common_time = new Array();

            // 遍历服务器数据显示到页面

            for (i in pre_data){
                rain.push(pre_data[i].rain);
                flow.push(pre_data[i].flow);
                wlevel.push(pre_data[i].wlevel);
                ph.push(pre_data[i].ph);
                pm.push(pre_data[i].pm);
                temp.push(pre_data[i].temp);
                hum.push(pre_data[i].hum);
                common_time.push(pre_data[i].time);
            }

            var ec_rvis_rain = echarts.init(document.getElementById('rvis-rain'));
            var ec_rvis_flow = echarts.init(document.getElementById('rvis-flow'));
            var ec_rvis_wlevel = echarts.init(document.getElementById('rvis-wlevel'));
            var ec_rvis_ph = echarts.init(document.getElementById('rvis-ph'));
            var ec_rvis_pm = echarts.init(document.getElementById('rvis-pm'));
            var ec_rvis_temp = echarts.init(document.getElementById('rvis-temp'));
            var ec_rvis_hum = echarts.init(document.getElementById('rvis-hum'));


            ec_rvis_rain_option1 = {
                tooltip : {
                    trigger: 'axis'
                },
                calculable : true,
                grid: {
                    left: '0%',
                    right: '0%',
                    top: '5%',
                    bottom: '0%',
                    containLabel: true
                },
                xAxis : [
                    {
                        type : 'category',
                        boundaryGap : false,
                        data : common_time
                    }
                ],
                yAxis : [
                    {
                        type : 'value'
                    }
                ],
                series : [
                    {
                        name:'雨量走势',
                        type:'line',
                        smooth:true,
                        itemStyle: {
                            normal: {   //颜色渐变函数 前四个参数分别表示四个位置依次为左、下、右、上
                                color: new echarts.graphic.LinearGradient(0, 0, 0, 1,[{
                                        offset: 0, color: '#d7f4f8' // 0% 处的颜色
                                    }, {
                                        offset: 0.5, color: '#eefcfd' // 100% 处的颜色
                                    }, {
                                        offset: 1, color: '#fff' // 100% 处的颜色
                                    }]
                                ),  //背景渐变色
                                lineStyle: {        // 系列级个性化折线样式
                                    width: 3,
                                    type: 'solid',
                                    color: "#cbd672"
                                }
                            },
                            emphasis: {
                                color: '#cbd672',
                                lineStyle: {        // 系列级个性化折线样式
                                    width:2,
                                    type: 'dotted',
                                    color: "#cbd672" //折线的颜色
                                }
                            }
                        },//线条样式
                        symbolSize:5, //折线点的大小
                        areaStyle: {normal: {}},
                        data:rain
                    }
                ]
            };
            ec_rvis_rain.setOption(ec_rvis_rain_option1);

            ec_rvis_flow_option2 = {
                tooltip : {
                    trigger: 'axis'
                },
                calculable : true,
                grid: {
                    left: '0%',
                    right: '0%',
                    top: '5%',
                    bottom: '0%',
                    containLabel: true
                },
                xAxis : [
                    {
                        type : 'category',
                        boundaryGap : false,
                        data : common_time
                    }
                ],
                yAxis : [
                    {
                        type : 'value'
                    }
                ],
                series : [
                    {
                        name:'河水流量走势',
                        type:'line',
                        smooth:true,
                        itemStyle: {
                            normal: {   //颜色渐变函数 前四个参数分别表示四个位置依次为左、下、右、上
                                color: new echarts.graphic.LinearGradient(0, 0, 0, 1,[{
                                        offset: 0, color: '#d7f4f8' // 0% 处的颜色
                                    }, {
                                        offset: 0.5, color: '#eefcfd' // 100% 处的颜色
                                    }, {
                                        offset: 1, color: '#fff' // 100% 处的颜色
                                    }]
                                ),  //背景渐变色
                                lineStyle: {        // 系列级个性化折线样式
                                    width: 3,
                                    type: 'solid',
                                    color: "#D61A15"
                                }
                            },
                            emphasis: {
                                color: '#D61A15',
                                lineStyle: {        // 系列级个性化折线样式
                                    width:2,
                                    type: 'dotted',
                                    color: "#d61a15" //折线的颜色
                                }
                            }
                        },//线条样式
                        symbolSize:5, //折线点的大小
                        areaStyle: {normal: {}},
                        data:flow
                    }
                ]
            };
            ec_rvis_flow.setOption(ec_rvis_flow_option2);

            ec_rvis_wlevel_option3 = {
                tooltip : {
                    trigger: 'axis'
                },
                calculable : true,
                grid: {
                    left: '0%',
                    right: '0%',
                    top: '5%',
                    bottom: '0%',
                    containLabel: true
                },
                xAxis : [
                    {
                        type : 'category',
                        boundaryGap : false,
                        data : common_time
                    }
                ],
                yAxis : [
                    {
                        type : 'value'
                    }
                ],
                series : [
                    {
                        name:'河流水位走势',
                        type:'line',
                        smooth:true,
                        itemStyle: {
                            normal: {   //颜色渐变函数 前四个参数分别表示四个位置依次为左、下、右、上
                                color: new echarts.graphic.LinearGradient(0, 0, 0, 1,[{
                                        offset: 0, color: '#d7f4f8' // 0% 处的颜色
                                    }, {
                                        offset: 0.5, color: '#eefcfd' // 100% 处的颜色
                                    }, {
                                        offset: 1, color: '#fff' // 100% 处的颜色
                                    }]
                                ),  //背景渐变色
                                lineStyle: {        // 系列级个性化折线样式
                                    width: 3,
                                    type: 'solid',
                                    color: "#d636d3"
                                }
                            },
                            emphasis: {
                                color: '#d636d3',
                                lineStyle: {        // 系列级个性化折线样式
                                    width:2,
                                    type: 'dotted',
                                    color: "#d636d3" //折线的颜色
                                }
                            }
                        },//线条样式
                        symbolSize:5, //折线点的大小
                        areaStyle: {normal: {}},
                        data:wlevel
                    }
                ]
            };
            ec_rvis_wlevel.setOption(ec_rvis_wlevel_option3);

            ec_rvis_ph_option4 = {
                tooltip : {
                    trigger: 'axis'
                },
                calculable : true,
                grid: {
                    left: '0%',
                    right: '0%',
                    top: '5%',
                    bottom: '0%',
                    containLabel: true
                },
                xAxis : [
                    {
                        type : 'category',
                        boundaryGap : false,
                        data : common_time
                    }
                ],
                yAxis : [
                    {
                        type : 'value'
                    }
                ],
                series : [
                    {
                        name:'河流酸碱度走势',
                        type:'line',
                        smooth:true,
                        itemStyle: {
                            normal: {   //颜色渐变函数 前四个参数分别表示四个位置依次为左、下、右、上
                                color: new echarts.graphic.LinearGradient(0, 0, 0, 1,[{
                                        offset: 0, color: '#d7f4f8' // 0% 处的颜色
                                    }, {
                                        offset: 0.5, color: '#eefcfd' // 100% 处的颜色
                                    }, {
                                        offset: 1, color: '#fff' // 100% 处的颜色
                                    }]
                                ),  //背景渐变色
                                lineStyle: {        // 系列级个性化折线样式
                                    width: 3,
                                    type: 'solid',
                                    color: "#d6742e"
                                }
                            },
                            emphasis: {
                                color: '#d6742e',
                                lineStyle: {        // 系列级个性化折线样式
                                    width:2,
                                    type: 'dotted',
                                    color: "#d6742e" //折线的颜色
                                }
                            }
                        },//线条样式
                        symbolSize:5, //折线点的大小
                        areaStyle: {normal: {}},
                        data:ph
                    }
                ]
            };
            ec_rvis_ph.setOption(ec_rvis_ph_option4);

            ec_rvis_pm_option5 = {
                tooltip : {
                    trigger: 'axis'
                },
                calculable : true,
                grid: {
                    left: '0%',
                    right: '0%',
                    top: '5%',
                    bottom: '0%',
                    containLabel: true
                },
                xAxis : [
                    {
                        type : 'category',
                        boundaryGap : false,
                        data : common_time
                    }
                ],
                yAxis : [
                    {
                        type : 'value'
                    }
                ],
                series : [
                    {
                        name:'PM2.5走势',
                        type:'line',
                        smooth:true,
                        itemStyle: {
                            normal: {   //颜色渐变函数 前四个参数分别表示四个位置依次为左、下、右、上
                                color: new echarts.graphic.LinearGradient(0, 0, 0, 1,[{
                                        offset: 0, color: '#d7f4f8' // 0% 处的颜色
                                    }, {
                                        offset: 0.5, color: '#eefcfd' // 100% 处的颜色
                                    }, {
                                        offset: 1, color: '#fff' // 100% 处的颜色
                                    }]
                                ),  //背景渐变色
                                lineStyle: {        // 系列级个性化折线样式
                                    width: 3,
                                    type: 'solid',
                                    color: "#6DD623"
                                }
                            },
                            emphasis: {
                                color: '#6DD623',
                                lineStyle: {        // 系列级个性化折线样式
                                    width:2,
                                    type: 'dotted',
                                    color: "#6dd623" //折线的颜色
                                }
                            }
                        },//线条样式
                        symbolSize:5, //折线点的大小
                        areaStyle: {normal: {}},
                        data:pm
                    }
                ]
            };
            ec_rvis_pm.setOption(ec_rvis_pm_option5);

            ec_rvis_temp_option6 = {
                tooltip : {
                    trigger: 'axis'
                },
                calculable : true,
                grid: {
                    left: '0%',
                    right: '0%',
                    top: '5%',
                    bottom: '0%',
                    containLabel: true
                },
                xAxis : [
                    {
                        type : 'category',
                        boundaryGap : false,
                        data : common_time
                    }
                ],
                yAxis : [
                    {
                        type : 'value'
                    }
                ],
                series : [
                    {
                        name:'温度走势',
                        type:'line',
                        smooth:true,
                        itemStyle: {
                            normal: {   //颜色渐变函数 前四个参数分别表示四个位置依次为左、下、右、上
                                color: new echarts.graphic.LinearGradient(0, 0, 0, 1,[{
                                        offset: 0, color: '#d7f4f8' // 0% 处的颜色
                                    }, {
                                        offset: 0.5, color: '#eefcfd' // 100% 处的颜色
                                    }, {
                                        offset: 1, color: '#fff' // 100% 处的颜色
                                    }]
                                ),  //背景渐变色
                                lineStyle: {        // 系列级个性化折线样式
                                    width: 3,
                                    type: 'solid',
                                    color: "#4fd6d2"
                                }
                            },
                            emphasis: {
                                color: '#4fd6d2',
                                lineStyle: {        // 系列级个性化折线样式
                                    width:2,
                                    type: 'dotted',
                                    color: "#4fd6d2" //折线的颜色
                                }
                            }
                        },//线条样式
                        symbolSize:5, //折线点的大小
                        areaStyle: {normal: {}},
                        data:temp
                    }
                ]
            };
            ec_rvis_temp.setOption(ec_rvis_temp_option6);

            ec_rvis_hum_option7 = {
                tooltip : {
                    trigger: 'axis'
                },
                calculable : true,
                grid: {
                    left: '0%',
                    right: '0%',
                    top: '5%',
                    bottom: '0%',
                    containLabel: true
                },
                xAxis : [
                    {
                        type : 'category',
                        boundaryGap : false,
                        data : common_time
                    }
                ],
                yAxis : [
                    {
                        type : 'value'
                    }
                ],
                series : [
                    {
                        name:'湿度走势',
                        type:'line',
                        smooth:true,
                        itemStyle: {
                            normal: {   //颜色渐变函数 前四个参数分别表示四个位置依次为左、下、右、上
                                color: new echarts.graphic.LinearGradient(0, 0, 0, 1,[{
                                        offset: 0, color: '#d7f4f8' // 0% 处的颜色
                                    }, {
                                        offset: 0.5, color: '#eefcfd' // 100% 处的颜色
                                    }, {
                                        offset: 1, color: '#fff' // 100% 处的颜色
                                    }]
                                ),  //背景渐变色
                                lineStyle: {        // 系列级个性化折线样式
                                    width: 3,
                                    type: 'solid',
                                    color: "#4fd6d2"
                                }
                            },
                            emphasis: {
                                color: '#4fd6d2',
                                lineStyle: {        // 系列级个性化折线样式
                                    width:2,
                                    type: 'dotted',
                                    color: "#4fd6d2" //折线的颜色
                                }
                            }
                        },//线条样式
                        symbolSize:5, //折线点的大小
                        areaStyle: {normal: {}},
                        data:hum
                    }
                ]
            };
            ec_rvis_hum.setOption(ec_rvis_hum_option7);



        }
    })



}

