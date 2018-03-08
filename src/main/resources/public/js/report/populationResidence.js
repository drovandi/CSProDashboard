
/* global ctx */

$(function () {
    setMenuActive("report-populationResidence");
    populate(ctx + "/rest/report/list/populationResidence?type=0", 'populationlist');
    populate(ctx + "/rest/report/list/populationResidence?type=0", 'populationlistMale');
    populate(ctx + "/rest/report/list/populationResidence?type=0", 'populationlistFemale');
});

var columnsSet = [{'data': 'range'}, {'data': 'type1'}, {'data': 'type2'}, {'data': 'type3'}, {'data': 'type4'}, {'data': 'type5'}, {'data': 'type6'}, {'data': 'type7'}, {'data': 'type8'}, {'data': 'type9'}, {'data': 'type10'}];
function populate(url, target) {
    $.getJSON(url, function (dataSet) {
        var table = $('#' + target).DataTable({
            data: dataSet,
            columns: columnsSet,
            responsive: true,
            lengthChange: false,
            buttons: ['csv', 'excel', 'pdf']
        });
        table.buttons().container().appendTo('#' + target + '_wrapper .col-sm-6:eq(0)');
    });
}

