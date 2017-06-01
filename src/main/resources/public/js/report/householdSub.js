
$(function () {
    setMenuActive("report-household-subcity");
    populate(ctx + "/rest/report/list/householdBySubcity", 'householdlist');
});

