
$(function () {
    setMenuActive("report-household-" + reportType);
    populate(ctx + "/rest/report/list/householdBy" + reportType, 'householdlist');
});
