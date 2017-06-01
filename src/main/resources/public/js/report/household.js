
$(function () {
    setMenuActive("report-household");
    populate(ctx + "/rest/report/list/household", 'householdlist');
});
