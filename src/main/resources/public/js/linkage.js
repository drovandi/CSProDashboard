var _ctx = $("meta[name='ctx']").attr("content");
var table;
var polling = false;
var poll;

$(document).ready(function () {
        
    setMenuActive("linkage");

    table = $('#dictList').DataTable({

        dom: "<'row'<'col-sm-6'B><'col-sm-6'f>>"
          + "<'row'<'col-sm-12'tr>>"
          + "<'row'<'col-sm-5'i><'col-sm-7'p>>",

        responsive: true,

        buttons: [],

        ajax: {
            "dataType": 'json',
            "contentType": "application/json; charset=utf-8",
            "type": "POST",
            "url": _ctx + "/dictionary/dictlist",
            "dataSrc": function (json) {
                return json;
            }
        },

        columns: [
            {'data': 'id'},
            {'data': 'name'},
            {'data': 'statusLabel'},
            {'data': 'total'},
            {'data': 'loaded'},                  
        ]
        });


    table.buttons().container().appendTo(
      '#userslist_wrapper .col-sm-6:eq(0)');       

});// fine ready

