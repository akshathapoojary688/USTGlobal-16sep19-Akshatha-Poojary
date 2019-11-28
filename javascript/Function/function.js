//named function
function add(num1,num2)
{
    console.log('sum = ',num1+num2);
}
add(10,20);




function add(num1,num2,num3)
{
    console.log('sum',num1+num2+num3);
}
add(10,20,30);



//FUNCTION EXPRESSION
var sub = function(num1,num2)
{
    console.log('subValue = ',num1-num2);

}
sub(20,10);


//OR
var sub = function(num1,num2)
{
    var subValue=num1-num2;
    return subValue;
}
var value = sub(90,89);
console.log('Value = ',value);








//self invoking function

(
    function(num1,num2)
    {
        console.log('value=',num1/num2);
    }
    
)(40,20);






//fat arrow function
var div=(num1,num2)=>
{
    console.log('value=',num1/num2);
}
div(80,20);






//fat arrow WHEN WE HV ONLY one parameter
var div1 = num1 =>
{
    console.log('value = ',num1/num2);
}
//fat arrow WHEN WE HV ONLY ONE LINE OF CODE
var div2 = num1 => console.log(num1);

greeting('deepu');
function greeting(msg)
{
    console.log('hello',msg);
}
 
