var _ctx = $("meta[name='ctx']").attr("content");
var arrLabel = [];
var arrDataMale = [];
var arrDataFemale = [];
var arrColor = [];

$(document).ready(function () {
    setMenuActive("report-sexdistribution-" + reportType);

    var pyramid = true;
    if (reportType == "sexByBroadAgeGroup") {
        $('.content-heading').text("Sex by Broad Age Groups");
        pyramid = false;
    }

    var jqxhr = $.getJSON(_ctx + "/rest/report/" + reportType, function (json) {
        $.each(json, function (i, obj) {
            arrLabel.push(obj[1]);
            arrDataMale.push(obj[2]);
            arrDataFemale.push(obj[3]);
        });

        $('.sexdistribution-fluid').animate(
          {queue: false, duration: 500}
        ).fadeIn('clip', '', 500, callBackShow);
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
                },
            }
        };

        if (pyramid) {
            configBar.type = "horizontalBar";
            configBar.options.scales = {
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
                    }],

                };

            configBar.options.tooltips = {
                callbacks: {
                    label: (item, data) => data.datasets[item.datasetIndex].label + ': ' + Math.abs(data.datasets[item.datasetIndex].data[item.index])
                }
            };

            // Reverse the order of the data so that younger ages are on bottom of pyramid
            configBar.data.labels.reverse();
            configBar.data.datasets[0].data.reverse();
            configBar.data.datasets[1].data.reverse();

            // In order to make left side of pyramid, negate the male counts to make the bars
            // go to the left
            configBar.data.datasets[0].data = configBar.data.datasets[0].data.map(x => - x);

        }
        var myChartBar = document.getElementById("bar-chart-area").getContext("2d");
        var myBar = new Chart(myChartBar, configBar);

    });

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

   