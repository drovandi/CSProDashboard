var _ctx = $("meta[name='ctx']").attr("content");
var table;
var polling = false;
var poll;

$(document).ready(function () {
        
    setMenuActive("dictionary");

    table = $('#dictList').DataTable({

        dom: "<'row'<'col-sm-6'B><'col-sm-6'f>>"
          + "<'row'<'col-sm-12'tr>>"
          + "<'row'<'col-sm-5'i><'col-sm-7'p>>",

        responsive: true,

        buttons: [{
                extend: 'csvHtml5',
                filename: 'dictList',
                title: 'dictList',
                exportOptions: {
                    columns: [0, 1, 2, 3, 4, 5]
                }
            }, {
                extend: 'excelHtml5',
                filename: 'dictList',
                title: 'dictList',
                exportOptions: {
                    columns: [0, 1, 2, 3, 4, 5]
                }
            }, {
                extend: 'pdfHtml5',
                filename: 'dictList',
                title: 'dictList',
                exportOptions: {
                    columns: [0, 1, 2, 3, 4]
                }
            }],

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

function reload_table() {
    table.ajax.reload(null, false); // reload datatable ajax
}

function ricarica_pagina() {
    location.reload();
}

function close() {
    ricarica_pagina();
}

function ricarica_tabella() {
    location.reload();
}

function pollOnOff() {
    polling = !polling;    
    if (polling) {
        poll = setInterval( function () {
            table.ajax.reload();}, 
            3000);        
    }
    else { 
        clearInterval(poll);
    }
    $("#btnPolling").text((polling ? "Stop  Poll" : "Start Poll"));
}

