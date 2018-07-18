/* global firstLevelGeography */

var _ctx = $("meta[name='ctx']").attr("content");

$(document).ready(function () {
    setMenuActive("report-sexdistributionRegion");
    var template = $('#template');
    var last = template;
    for (var i in firstLevelGeography) {
        var c = template.clone();
        c.find('#bar-chart-area').attr('id', 'bar-chart-area-' + i);
        c.find('.regionName').text(firstLevelGeography[i].name);
        last.after(c);
        last = c;
    }
    template.remove();
    for (var i in firstLevelGeography) {
        (function (i, region) {
            $.getJSON(_ctx + "/rest/report/sexByAgeGroupRegion?region=" + region.code, function (json) {
                var arrLabel = [];
                var arrDataMale = [];
                var arrDataFemale = [];
                $.each(json, function (i, obj) {
                    arrLabel.push(obj[2]);
                    arrDataMale.push(obj[3]);
                    arrDataFemale.push(obj[4]);
                });
                $('.sexdistribution-fluid')
                        .animate({queue: false, duration: 500})
                        .fadeIn('clip', '', 500, callBackShow);

                // Reverse the order of the data so that younger ages are on bottom of pyramid
                arrLabel.reverse();
                arrDataMale.reverse();
                arrDataFemale.reverse();

                // In order to make left side of pyramid, negate the male counts to make the bars
                // go to the left
                arrDataMale = arrDataMale.map(x => - x);

                var configBar = {
                    type: 'horizontalBar',
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
                        scales: {
                            xAxes: [{
                                ticks: {
                                    // Don't show negative values used to make left side of pyramid
                                    callback: function(value, index, values) {
                                        return Math.abs(value);
                                    }
                                }
                            }],
                            yAxes: [{
                                stacked: true, // Allow male and female bars to be aligned
                            }]
                        },
                        tooltips: {
                            callbacks: {
                                label: (item, data) => data.datasets[item.datasetIndex].label + ': ' + Math.abs(data.datasets[item.datasetIndex].data[item.index])
                            }
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
        })(i, firstLevelGeography[i]);
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

   