const message = new Promise(function(resolve,reject){
    if(30>20){
        resolve('success')
    }else{
        reject('failed')
    }
})
message.then(function(msg){
    console.log('success msg:',msg)
}).catch(function(error){
    console.log('failure message',error)
})


console.log("======================================");
const employee = new Promise(function(resolve,reject){
    if(30>20){
        resolve([{
            name:'billgates',
            age:67
        },{
            name:'mark zukerberg',
            age:40
        },{
            name:'deepu',
            age:23
        }
    ])
    }else{
        reject('failed')
    }
})



employee.then(function(data){
    console.log('employee data:',data)
}).catch(function(error){
    console.log('failure message',error)
})

console.log("======================================================");

// CLOSURES
function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter+10;
        return count;
    }
    return innerFunction
}
let innerFunc = outerFunction(20)
let counter = innerFunc()
console.log('counter value',counter)