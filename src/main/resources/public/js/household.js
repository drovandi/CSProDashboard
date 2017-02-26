
$(function () {
    setMenuActive("report-household");
    $.getJSON(ctx + "/rest/report/list/household", function (json) {
        var _data = json.splice(1);
        var data = [];
        for (var i in _data) {
            var a = _data[i].name.split('#');
            a.push(_data[i].household);
            data.push(a);
        }
        var name = json[0].name.split('#');
        name.push('Total');
        populate(data, name);
    });
});

function populate(dataSet, name) {
    var columnsSet = [];
    for (var i in name) {
        columnsSet.push({title: name[i]});
    }
    var table = $('#householdlist').DataTable({
        data: dataSet,
        columns: columnsSet,
        responsive: true,
        lengthChange: false,
        pageLength: 10,
        order: [[0, "asc"]],
        buttons: ['csv', 'excel', 'pdf']
    });
    table.buttons().container().appendTo('#householdlist_wrapper .col-sm-6:eq(0)');
}
