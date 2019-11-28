var myName = "deepu";
console.log(myName, typeof myName);
var age;
console.log(age, typeof age);
var mobileNumber = 564386523;
console.log(mobileNumber, typeof mobileNumber);
var address;
address = "kundapur";
address = 6789;
console.log(address, typeof address);

console.log("============================");
let calAge = function() : void{
    console.log("age is 22");
}
calAge();

console.log("=============================");

 class Person {
    constructor(public name : string , public age : number){
         
    }
}
let person1 = new Person("aks",22);
console.log(person1);

class Student extends Person{
    constructor(name:string,age:number, public rollno : number){
        super(name,age);
    }
}
let student = new Student("aksh", 23 ,3);
console.log(student);