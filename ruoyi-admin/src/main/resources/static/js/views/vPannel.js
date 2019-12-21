function v_onload() {

    //首页图表 村镇村民人口地域分布可视化
    init_ec_mbygroup();
    //首页图表 村镇党员地域分布可视化
    init_ec_pbygroup();
    //首页图表 三维村镇人口可视化
    init_3d_v_pm();
    //首页图标，村民林地信息可视化
    init_ec_gbygroup();
    //首页图标，实时政事类型可视化
    init_ss_tbygroup();
}

function init_ss_tbygroup(){
    var ss_tbygroup = echarts.init(document.getElementById('ss_tbygroup'));
    $.ajax({
        type: "GET",
        url: "/api/shishi/type",
        datatype: "json",
        success:function(data){
            var ssgroup_data=data.data;
            var x_data =new Array();
            var y_data =new Array();
            for( x in ssgroup_data){
                if(ssgroup_data[x].type == ''){
                    x_data.push('未知');
                }else{
                    x_data.push(ssgroup_data[x].type);

                }
            }
            for( y in ssgroup_data){
                y_data.push(ssgroup_data[y].vtype);
            }
    option = {
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: x_data
        },
        series : [
            {
                name: '访问来源',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:[
                    {value:y_data[0], name:x_data[0]},
                    {value:y_data[1], name:x_data[1]},
                    {value:y_data[2], name:x_data[2]}
                ],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };
    ss_tbygroup.setOption(option);
        }
    });
}

function init_ec_gbygroup(){
   $.ajax({
       type: "GET",
       url: "/api/flandinfo/gtype",
       dataType: "json",
       success: function (data) {
            var gbygroup_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            var z_data = new Array();
            for( x in gbygroup_data){
                if(gbygroup_data[x].grouptype == ''){
                    x_data.push('未知');
                }else{
                    x_data.push(gbygroup_data[x].grouptype);

                }
            }
            for( y in gbygroup_data){
               y_data.push(gbygroup_data[y].collective);
            }
           for( z in gbygroup_data){
                   z_data.push(gbygroup_data[z].contracted);
           }
           var ec_gbygroup = echarts.init(document.getElementById('ec_gbygroup'));

           option = {
               legend: {},
               tooltip: {},
               dataset: {
                   source: [
                       //还没找到更好的写法，暂时写成这样
                       ['product', '集体经营面积', '承包到户面积'],
                       [x_data[0], y_data[0], z_data[0]],
                       [x_data[1], y_data[1], z_data[1]],
                       [x_data[2], y_data[2], z_data[2]],
                       [x_data[3], y_data[3], z_data[3]],
                       [x_data[4], y_data[4], z_data[4]],
                       [x_data[5], y_data[5], z_data[5]],
                       [x_data[6], y_data[6], z_data[6]],
                       [x_data[7], y_data[7], z_data[7]],
                       [x_data[8], y_data[8], z_data[8]],
                       [x_data[9], y_data[9], z_data[9]],
                       [x_data[10], y_data[10], z_data[10]],
                       [x_data[11], y_data[11], z_data[11]],
                       [x_data[12], y_data[12], z_data[12]],
                       [x_data[13], y_data[13], z_data[13]],
                       [x_data[14], y_data[14], z_data[14]],
                       [x_data[15], y_data[15], z_data[15]],
                       [x_data[16], y_data[16], z_data[16]],
                       [x_data[17], y_data[17], z_data[17]]
                   ]
               },
               xAxis: {type: 'category'},
               yAxis: {},
               // Declare several bar series, each will be mapped
               // to a column of dataset.source by default.
               series: [
                   {type: 'bar'},
                   {type: 'bar'}
               ]
           };
           ec_gbygroup.setOption(option);
       }
   })
}

function init_ec_mbygroup() {
    $.ajax({
        type: "GET",
        url: "/api/count/m",
        dataType: "json",
        success: function (data) {
            var mbygroup_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for( x in mbygroup_data){
                if(mbygroup_data[x].marea == ''){
                    x_data.push('未知');
                }else {
                    x_data.push(mbygroup_data[x].marea);
                }
            }
            for (y in mbygroup_data){
                y_data.push(mbygroup_data[y].msum);
            }
            var ec_mbygroup = echarts.init(document.getElementById('ec_mbygroup'));
            ec_mbygroup_option = {
                color: ['#66fccc'],
                tooltip : {
                    trigger: 'axis',
                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                    }
                },
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
                        name:'人口数量',
                        type:'bar',
                        barWidth: '60%',
                        data:y_data
                    }
                ]
            };
            ec_mbygroup.setOption(ec_mbygroup_option);
        }
    })
}

function sort_ec_mbygroup() {
    $.ajax({
        type: "GET",
        url: "/api/count/mSort",
        dataType: "json",
        success: function (data) {
            var mbygroup_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for( x in mbygroup_data){
                if(mbygroup_data[x].marea == ''){
                    x_data.push('未知');
                }else {
                    x_data.push(mbygroup_data[x].marea);
                }
            }
            for (y in mbygroup_data){
                y_data.push(mbygroup_data[y].msum);
            }
            var ec_mbygroup = echarts.init(document.getElementById('ec_mbygroup'));
            ec_mbygroup_option = {
                color: ['#66fccc'],
                tooltip : {
                    trigger: 'axis',
                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                    }
                },
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
                        name:'人口数量',
                        type:'bar',
                        barWidth: '60%',
                        data:y_data
                    }
                ]
            };
            ec_mbygroup.setOption(ec_mbygroup_option);
        }
    })
}

function init_ec_pbygroup() {
    $.ajax({
        type: "GET",
        url: "/api/count/pm",
        dataType: "json",
        success: function (data) {
            var mbygroup_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for( x in mbygroup_data){
                if(mbygroup_data[x].parea == ''){
                    x_data.push('未知');
                }else {
                    x_data.push(mbygroup_data[x].parea);
                }
            }
            for (y in mbygroup_data){
                y_data.push(mbygroup_data[y].psum);
            }

            var ec_pbygroup = echarts.init(document.getElementById('ec_pbygroup'));
            ec_pbygroup_option = {
                color: ['#ff3399'],
                tooltip : {
                    trigger: 'axis',
                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                    }
                },
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
                        name:'人口数量',
                        type:'bar',
                        barWidth: '60%',
                        data:y_data
                    }
                ]
            };
            ec_pbygroup.setOption(ec_pbygroup_option);

        }
    })
}

function sort_ec_pbygroup() {
    $.ajax({
        type: "GET",
        url: "/api/count/pmSort",
        dataType: "json",
        success: function (data) {
            var mbygroup_data = data.data;
            var x_data = new Array();
            var y_data = new Array();
            for( x in mbygroup_data){
                if(mbygroup_data[x].parea == ''){
                    x_data.push('未知');
                }else {
                    x_data.push(mbygroup_data[x].parea);
                }
            }
            for (y in mbygroup_data){
                y_data.push(mbygroup_data[y].psum);
            }

            var ec_pbygroup = echarts.init(document.getElementById('ec_pbygroup'));
            ec_pbygroup_option = {
                color: ['#ff3399'],
                tooltip : {
                    trigger: 'axis',
                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                    }
                },
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
                        name:'人口数量',
                        type:'bar',
                        barWidth: '60%',
                        data:y_data
                    }
                ]
            };
            ec_pbygroup.setOption(ec_pbygroup_option);

        }
    })
}

function init_3d_v_pm() {
    var pre_data;
    var area_group = new Array();
    var people_group = new Array();
    var xyz_data = new Array();
    var ec_3d_v_pm = echarts.init(document.getElementById('3d_v_pm'));

    $.ajax({
        type: "GET",
        url: "/api/count/g_cPM",
        dataType: "json",
        success: function (data_pm) {
            pre_data = data_pm.data;
            var pg_temp = Object.keys(pre_data[0]);
            pg_temp.splice(arrIndex(pg_temp,'area'),1);
            //重新确定人员分组的顺序(暂时写死）
            pg_temp = ['pwoman','pman','psum','mwoman','mman','msum'];


            //确定area_group
            for ( area_name in pre_data){
                area_group.push(pre_data[area_name].area);
            }
            //确定xyz_data
            for( pg_name in pre_data){
                var ag = area_group.indexOf(pre_data[pg_name].area);
                var temp_data = pre_data[pg_name];
                delete temp_data["area"];
                var temp_keys = Object.keys(temp_data);
                for(i=0;i<temp_keys.length;i++){
                    var this_key = temp_keys[i];
                    var pg = pg_temp.indexOf(temp_keys[i]);
                    var z_value = temp_data[this_key];
                    xyz_data.push([pg,ag,z_value])
                }
            }
            //确定people_group
            // 英文 - 中文替换
            for ( item in pg_temp){
                if(pg_temp[item].indexOf('p') == 0 ){
                    pg_temp[item] = pg_temp[item].replace('p','党员');
                    if(pg_temp[item].indexOf('sum') >= 0){
                        pg_temp[item] = pg_temp[item].replace('sum','总数');
                    }else if(pg_temp[item].indexOf('man') >= 0 && pg_temp[item].indexOf('wo') < 0){
                        pg_temp[item] = pg_temp[item].replace('man','男性');
                    }else if(pg_temp[item].indexOf('woman') >= 0 && pg_temp[item].indexOf('wo') >= 0){
                        pg_temp[item] = pg_temp[item].replace('woman','女性');
                    }
                }
                if(pg_temp[item].indexOf('m') == 0 ){
                    pg_temp[item] = pg_temp[item].replace('m','村民');
                    if(pg_temp[item].indexOf('sum') >= 0){
                        pg_temp[item] = pg_temp[item].replace('sum','总数');
                    }else if(pg_temp[item].indexOf('man') && pg_temp[item].indexOf('wo') < 0){
                        pg_temp[item] = pg_temp[item].replace('man','男性');
                    }else if(pg_temp[item].indexOf('woman') >= 0 && pg_temp[item].indexOf('wo') >= 0){
                        pg_temp[item] = pg_temp[item].replace('woman','女性');
                    }
                }
                people_group = pg_temp;
            }
            //确定3D_EC 坐标系与数据
            var g_cg =area_group;
            var p_cg = people_group;
            var data = xyz_data;
            ec_3d_v_pm_option = {
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
                    type: 'category',
                    data: g_cg
                },
                yAxis3D: {
                    type: 'category',
                    data: p_cg
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
                    data: data.map(function (item) {
                        return {
                            value: [item[1], item[0], item[2]],
                        }
                    }),
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
            ec_3d_v_pm.setOption(ec_3d_v_pm_option);

        }
    });
}

//找到包含value的值 在arr数组中的下标
function arrIndex(arr, value) {
    var i = arr.length;
    while (i--) {
        if (arr[i] === value) {
            return i;
        }
    }
    return false;
}