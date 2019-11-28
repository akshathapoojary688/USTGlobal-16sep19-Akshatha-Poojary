const person = {
                 name:'sundara',
                 age:100,
                 color:'white',
                 address:{
                          city:'bijapur',
                          state:'karnataka',
                          pincode:591115
                 },
    hobbies : ['coding','bird watching','singing']
                 }
//javascript object to json object
console.log('javascript person object',person)
const jsonObject = JSON.stringify(person)
console.log('JSONperson object',jsonObject)

//json object to javascript
const javaScriptPersonObject = JSON.parse(jsonObject)
console.log('javascript person object after parse',javaScriptPersonObject)

console.log("==========================================");
localStorage.setItem('email','billgates@gmail.com');
const emailId = localStorage.getItem('email')
console.log('email id is',emailId)
localStorage.clear();