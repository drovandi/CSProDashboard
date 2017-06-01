
$(function () {
    setMenuActive("report-household-woreda");
    populate(ctx + "/rest/report/list/householdByWoreda", 'householdlist');
});

