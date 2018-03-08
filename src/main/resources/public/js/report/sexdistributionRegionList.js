/* global regions */

var _ctx = $("meta[name='ctx']").attr("content");

$(document).ready(function () {
    setMenuActive("report-sexdistributionRegion");
    var template = $('#template');
    var last = template;
    for (var i in regions) {
        var c = template.clone();
        c.find('#bar-chart-area').attr('id', 'bar-chart-area-' + i);
        c.find('.regionName').text(regions[i]);
        last.after(c);
        last = c;
    }
    template.remove();
    for (var i in regions) {
        (function (i, region) {
            $.getJSON(_ctx + "/rest/report/list/sexByAgeGroupRegion?region=" + i, function (json) {
                var arrLabel = [];
                var arrDataMale = [];
                var arrDataFemale = [];
                $.each(json, function (i, obj) {
                    arrLabel.push(obj.range);
                    arrDataMale.push(obj.male);
                    arrDataFemale.push(obj.female);
                });
                $('.sexdistribution-fluid')
                        .animate({queue: false, duration: 500})
                        .fadeIn('clip', '', 500, callBackShow);
                var configBar = {
                    type: 'bar',
                    data: {
                        labels: arrLabel,
                        datasets: [
                            {
                                data: arrDataMale,
                                backgroundColor: color[5][2],
                                label: 'Male'
                            }, {
                                data: arrDataFemale,
                                backgroundColor: color[69][2],
                                label: 'Female'
                            }],
                    },
                    options: {
                        responsive: true,
                        legend: {
                            position: 'top'
                        },
                        title: {
                            display: false,
                            text: 'SEX/DISTRIBUTION'
                        },
                        animation: {
                            animateScale: true,
                            animateRotate: true
                        }
                    }
                };
                var myChartBar = document.getElementById("bar-chart-area-" + i).getContext("2d");
                var myBar = new Chart(myChartBar, configBar);
            });
        })(i, regions[i]);
    }
});

function callBackHide() {
    setTimeout(function () {
        $("#center").fadeOut();
    }, 1000);
}

function callBackShow() {
    setTimeout(function () {
        $("#center").fadeIn();
    }, 1000);
}

   