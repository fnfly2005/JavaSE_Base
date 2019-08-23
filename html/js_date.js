var date = new Date();
var year = date.getFullYear();
var month = date.getMonth()+1;
var day = date.getDate();
var week = date.getDay();

function getWeek(num){
	var weeks = ['星期日','星期一','星期二','星期三','星期四','星期五','星期六'];
	
	return weeks[num];
}

var time = date.getTime();//毫秒值

var str_date ="9/28/17";

var time2 = Date.parse(str_date);

var date2 = new Date(time2);
