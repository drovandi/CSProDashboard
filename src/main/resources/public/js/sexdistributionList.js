var _ctx = $("meta[name='ctx']").attr("content");
var arrLabel = [];
var arrDataMale = [];
var arrDataFemale = [];
var arrColor = [];

$(document).ready(function () {
    setMenuActive("sexdistribution-list");
    var jqxhr = $.getJSON(_ctx + "/rest/report/list/sexByAgeGroup", function (json) {
        console.log("success");
    }).done(function (json) {
        console.log("second success");
    }).fail(function (json) {
        console.log("error");
    }).always(function (json) {
        console.log("complete");
        $.each(json, function (i, obj) {
            arrLabel.push(obj.range);
            arrDataMale.push(obj.male);
            arrDataFemale.push(obj.female);
        });

        $('.loading').hide();

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
                }
            }
        };

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

   