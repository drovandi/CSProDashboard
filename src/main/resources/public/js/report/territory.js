
function populate(url, tableId) {
    $.getJSON(url, function (json) {
        var _data = json.splice(1);
        var data = [];
        for (var i in _data) {
            var a = _data[i].name.split('#');
            a.push(_data[i].field);
            a.push(_data[i].freshlist);
            a.push(_data[i].expected);
            a.push(_data[i].fieldFreshlist);
            a.push(_data[i].fieldExpected);
            a.push(_data[i].freshlistExpected);
            data.push(a);
        }
        var name = json[0].name.split('#');
        var columnsSet = [];
        for (var i in name) {
            columnsSet.push({title: name[i]});
        }
        columnsSet.push({title: 'Fieldword', render: $.fn.dataTable.render.number(',', '.', 0), 'className': 'numeric'});
        columnsSet.push({title: 'Freshlist', render: $.fn.dataTable.render.number(',', '.', 0), 'className': 'numeric'});
        columnsSet.push({title: 'Expected', render: $.fn.dataTable.render.number(',', '.', 0), 'className': 'numeric'});
        columnsSet.push({title: 'Field/List', render: $.fn.dataTable.render.number(',', '.', 1), 'className': 'numeric'});
        columnsSet.push({title: 'Field/Exp', render: $.fn.dataTable.render.number(',', '.', 1), 'className': 'numeric'});
        columnsSet.push({title: 'List/Exp', render: $.fn.dataTable.render.number(',', '.', 1), 'className': 'numeric'});
        __populate(data, columnsSet, tableId);
    });
}

function __populate(dataSet, columnsSet, tableId) {
    var tFoot = $(document.createElement('tfoot'));
    var footTr = $(document.createElement('tr'));
    $('#' + tableId).append(tFoot.append(footTr));
    var filters = [];
    for (var i in columnsSet) {
        if (columnsSet[i].className !== 'numeric') {
            filters.push(i);
        }
        footTr.append($(document.createElement('th')));
    }
    var table = $('#' + tableId).DataTable({
        data: dataSet,
        columns: columnsSet,
        responsive: true,
        lengthChange: false,
        pageLength: 10,
        order: [[0, "asc"]],
        buttons: ['csv', 'excel', 'pdf'],
        initComplete: function () {
            this.api().columns(filters).every(function () {
                var column = this;
                var select = $('<select><option value=""></option></select>')
                        .appendTo($(column.footer()).empty())
                        .on('change', function () {
                            var val = $.fn.dataTable.util.escapeRegex($(this).val());
                            column.search(val ? '^' + val + '$' : '', true, false).draw();
                        });
                column.data().unique().sort().each(function (d, j) {
                    select.append('<option value="' + d + '">' + d + '</option>');
                });
            });
        }
    });
    table.buttons().container().appendTo('#' + tableId + '_wrapper .col-sm-6:eq(0)');
}

