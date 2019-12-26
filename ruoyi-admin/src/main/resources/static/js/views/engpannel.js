function e_onload(){

    //首页图表 电能管理可视化
    init_io_engmana();

}

function init_io_engmana() {
    $.ajax({
        type: "GET",
        url: "/api/engmana/engid",
        dataType: "json",
        success: function (data) {
            var engmana_data = data.data;
            var fv_data = new Array();
            var gv_data = new Array();
            var re_data = new Array();
            var lo_data = new Array();
            var ou_data = new Array();
            var ex_data = new Array();
            var sun_data = new Array();
            var wo_data = new Array();
            for ( fv in engmana_data){
                fv_data.push(engmana_data[fv].fvoltage);
            }
            for (gv in engmana_data){
                gv_data.push(engmana_data[gv].gvoltage);
            }
            for (re in engmana_data){
                re_data.push(engmana_data[re].rechcurrent);
            }
            for (lo in engmana_data){
                lo_data.push(engmana_data[lo].loadcurrent);
            }
            for ( ou in engmana_data){
                ou_data.push(engmana_data[ou].outvoltage);
            }
            for ( ex in engmana_data){
                ex_data.push(engmana_data[ex].extvoltage);
            }
            for ( sun in engmana_data){
                sun_data.push(engmana_data[sun].sunvoltage);
            }
            for ( wo in engmana_data){
                wo_data.push(engmana_data[wo].worktemp);
            }

            var io_engmana = echarts.init(document.getElementById('io_engmana'));
            io_engmana_option = {
                title: {
                    text: '折线图堆叠'
                },
                tooltip: {
                    trigger: 'axis'
                },
                legend: {
                    data:['电能1','电能2']
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
                    data: ['电池1电压','电池组电压','充电电流','负载电流','输出电压','外部电源电压','太阳能电压','工作温度']
                },
                yAxis: {
                    type: 'value'
                },
                series: [
                    {
                        name:'电能1',
                        type:'line',
                        stack: '总量',
                        data:[fv_data[0],gv_data[0],re_data[0],lo_data[0],ou_data[0],ex_data[0],sun_data[0],wo_data[0]]
                    },
                    {
                        name:'电能2',
                        type:'line',
                        stack: '总量',
                        data:[fv_data[1],gv_data[1],re_data[1],lo_data[1],ou_data[1],ex_data[1],sun_data[1],wo_data[1]]
                    }
                ]
            };
            io_engmana.setOption(io_engmana_option);
        }
    })
}