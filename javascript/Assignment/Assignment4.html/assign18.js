

const items = [{
                 name :'earings',
                 id:1,
                 price:500
              },{
                  name:'lipstick',
                  id:2,
                  price:5000
              },{
                  name:'kajal',
                  id:3,
                  price:400
              },{
                  name:'eyeliner',
                  id:4,
                  price:600
              }]


              const updateItem = items.map(function(item,index){
                  item.price = item.price+300
                  return item
              })
              console.log('after map arrow function ',updateItem)

              //fat arrow function
              const itemsArrow = items.map((value) =>{
                  value.price = value.price+300
                  return value
              })
              console.log('after map arrow function ',itemsArrow)
console.log('====================================================')


const movies = [{
    name :'kurukshethra',
    id:1,
    price:5000
 },{
     name:'pailwan',
     id:2,
     price:500
 },{
     name:'arya',
     id:3,
     price:4000
 },{
     name:'mr perfect',
     id:4,
     price:600
 }]


 const updatedMovie = movies.map(function(movie,index){
     movie.price = movie.price+300
     return movie
 })
 console.log('after map arrow function ',updateItem)

 //fat arrow function
 const moviesArrow = movies.map((value) =>{
     value.price = value.price+300
     return value
 })
 console.log('after map arrow function ',moviesArrow)
console.log('====================================================');


const fruits = [{
    name :'orange',
    id:1,
    price:500
 },{
     name:'apple',
     id:2,
     price:200
 },{
     name:'sapota',
     id:3,
     price:400
 },{
     name:'musambi',
     id:4,
     price:300
 }]


 const updatedFruits = fruits.map(function(fruit,index){
     fruit.price = fruit.price+300
     return fruit
 })
 console.log('after map arrow function ',updateFruits)

 //fat arrow function
 const fruitsArrow = fruits.map((value) =>{
     value.price = value.price+300
     return value
 })
 console.log('after map arrow function ',fruitsArrow)
console.log('====================================================');


const vegs = [{
    name :'tomato',
    id:1,
    price:500
 },{
     name:'onion',
     id:2,
     price:230
 },{
     name:'caroot',
     id:3,
     price:407
 },{
     name:'beans',
     id:4,
     price:600
 }]


 const updatedVegs = vegs.map(function(veg,index){
     veg.price = veg.price+300
     return veg
 })
 console.log('after map arrow function ',updateItem)

 //fat arrow function
 const vegsArrow = vegs.map((value) =>{
     value.price = value.price+300
     return value
 })
 console.log('after map arrow function ',vegsArrow)
console.log('====================================================');


const cars = [{
    name :'jaguar',
    id:1,
    price:50000
 },{
     name:'audi',
     id:2,
     price:40000
 },{
     name:'bmw',
     id:3,
     price:25000
 },{
     name:'maruthi',
     id:4,
     price:6000
 }]


 const updatedCar = cars.map(function(car,index){
     car.price = car.price+300
     return car
 })
 console.log('after map arrow function ',updatedCar)

 //fat arrow function
 const carsArrow = cars.map((value) =>{
     value.price = value.price+300
     return value
 })
 console.log('after map arrow function ',carsArrow)
console.log('====================================================');


const mobiles = [{
    name :'oppo',
    id:1,
    price:18000
 },{
     name:'moto',
     id:2,
     price:15000
 },{
     name:'samsong',
     id:3,
     price:40000
 },{
     name:'redmi',
     id:4,
     price:6000
 }]


 const updatedMobile = mobiles.map(function(mobile,index){
     mobile.price = mobile.price+300
     return mobile
 })
 console.log('after map arrow function ',updatedMobile)

 //fat arrow function
 const mobilesArrow = mobiles.map((value) =>{
     value.price = value.price+300
     return value
 })
 console.log('after map arrow function ',mobilesArrow)
console.log('====================================================');



const laptops= [{
    name :'lenovo',
    id:1,
    price:36000
 },{
     name:'hp',
     id:2,
     price:50000
 },{
     name:'dell',
     id:3,
     price:45000
 },{
     name:'apple',
     id:4,
     price:60000
 }]


 const updatedLaptop = laptops.map(function(laptop,index){
     laptop.price = laptop.price+300
     return laptop
 })
 console.log('after map arrow function ',updateLaptop)

 //fat arrow function
 const laptopsArrow = laptops.map((value) =>{
     value.price = value.price+300
     return value
 })
 console.log('after map arrow function ',laptopsArrow)
console.log('====================================================');



const games = [{
    name :'football',
    id:1,
    price:500
 },{
     name:'valleyball',
     id:2,
     price:200
 },{
     name:'kabaddi',
     id:3,
     price:4000
 },{
     name:'koko',
     id:4,
     price:600
 }]


 const updatedGames = games.map(function(game,index){
     game.price = game.price+300
     return game
 })
 console.log('after map arrow function ',updatedGames)

 //fat arrow function
 const gamesArrow = games.map((value) =>{
     value.price = value.price+300
     return value
 })
 console.log('after map arrow function ',moviesArrow)
console.log('====================================================');


const  brands = [{
    name :'bisleri',
    id:1,
    price:50
 },{
     name:'kinley',
     id:2,
     price:560
 },{
     name:'aqua',
     id:3,
     price:400
 },{
     name:'aquafina',
     id:4,
     price:60
 }]


 const updatedBrand = brands.map(function(movie,index){
     brand.price = brand.price+300
     return brand
 })
 console.log('after map arrow function ',updatedBrand)

 //fat arrow function
 const brandsArrow = brands.map((value) =>{
     value.price = value.price+300
     return value
 })
 console.log('after map arrow function ',brandsArrow)
console.log('====================================================');


const items1 = [{
    name :'book',
    id:1,
    price:50
 },{
     name:'bag',
     id:2,
     price:70
 },{
     name:'pen',
     id:3,
     price:40
 },{
     name:'pencil',
     id:4,
     price:60
 }]


 const updatedItems1 = movies.map(function(item1,index){
     item1.price = item1.price+300
     return item1
 })
 console.log('after map arrow function ',updateItem1)

 //fat arrow function
 const items1Arrow = items1.map((value) =>{
     value.price = value.price+300
     return value
 })
 console.log('after map arrow function ',items1Arrow)
console.log('====================================================');





 
 
     
 
 
 
 
 
 
 
 
 



















              
              
                  
              
              
              
              
              
              
              
              
              
    








