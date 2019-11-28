//1st constructor
var todayDate=new Date();
console.log('todays date is'+todayDate);

console.log('day='+todayDate.getDay());
console.log('month ='+todayDate.getMonth());
console.log('year='+todayDate.getFullYear());
console.log('date ='+todayDate.getDate());
// 2nd construstors
console.log('===============================');
var constMilli = new Date(0);
console.log('date = '+constMilli);
//3rd 
var constString = new Date('Nov 10');
console.log('date string constructor',constString);
//4rth
var constYear = new Date(2017,10);
console.log('date year constructor',constYear);


