var brands = ['kingfisher','bisleri','aqua','kinley']
console.log('for of loop');
for(var names of brands)
{
    console.log('Brand = ',names);
}
console.log('--------------------------------');

console.log('for in loop');
var brands = ['kingfisher','bisleri','aqua','kinley']
for(var index in  brands){
    console.log('Brand = ',brands[index]);
}
console.log('---------------------------------');

var person = {
    name : 'deepu',
    age : 23,
    color :'white', 
}                                                                                                                                                                                                                                                                                                                                                                                                         
for(var key in person){
    console.log('value = ',person[key]);
}

console.log('foreach ');
var movies = ['kuruksethra' ,' pailwan' , 'kgf' , 'robert'];
movies.forEach(function(value,index)
{
    console.log('movie = ', value);
}
);

console.log('===================================');

var items = [
    {
        item : 'bangle',
        id:1,
        price:100
    },
    {
        item : 'eyeliner',
        id:2,
        price:500
    },
    {
        item : 'watch',
        id:3,
        price:5000
    },
    {
        item : 'bike',
        id:4,
        price:1000000
    },
]
items.forEach(function(item,index){
    console.log('item = ',item);
    console.log('index of item = ',index);
})

console.log('========================================');
console.log('does not concider');
var numbers = [10,20,30,,40,50]
for(var i = 0;i<numbers.length;i++)
{
    console.log('for loop ',numbers[i])
}

console.log('========================');
numbers.forEach(function(value){
    console.log('for each',value)
})

console.log('============================');
numbers['hundred'] = 100;
for( var i =0; i<numbers.length;i++){
    console.log('for loop',numbers[i])
}

console.log('===========================');
for(var i in numbers)
{
    console.log('for in loop ',numbers[i])
}

/*
//var keyword
var name;
var name = 'pailwan';
name = 'prasthanam';


//let keyword
console.log(name1)
let name1;
let name1 = 'saho';
name1 = 'valmiki';

//const
const name2;
const name2 = 'dream girl'
name2 = 'kabir sing';

*/

for(var i = 0; i<5;i++)
{
    console.log('inside for loop ',i);

}
console.log('outside for loop',i);


for(let i = 0; i<5;i++)
{
    console.log('inside for loop ',i);

}
console.log('outside for loop',i);



