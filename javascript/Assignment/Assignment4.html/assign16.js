const mobiles = ['oppo','redmi','samsung','nokia'];
console.log(typeof mobiles);

const isArrayOrNot = Array.isArray(mobiles);
console.log('mobiles array or not',isArrayOrNot);

 const hasSamsung = mobiles.includes('samsung');
 console.log('using include method',hasSamsung);

 mobiles.push('lenovo','vivo');
 console.log('after push method ',mobiles);

 mobiles.pop();
 console.log('after pop method',mobiles);

 mobiles.unshift('apple','sony');
 console.log('after unshift',mobiles);
 
 mobiles.shift();
 console.log('after shift method',mobiles);

 mobiles.splice(1,2,'intex','moto');
 console.log('after splice method',mobiles);

 mobiles.slice(2,4);
  const afterSlice = console.log('after slice method',mobiles);
  console.log('after slice method',afterSlice);

  const indexOfNokia =  mobiles.indexOf('nokia');
  console.log('index of nokia' ,indexOfNokia);

   const stringMobiles = mobiles.join('-');
  console.log('after join method', stringMobiles);

 
console.log("------------------------------------------------------------------");
  



const tv = ['panasonic','sony','samsung','tcl'];
console.log(typeof tv);

const isArrayOrNot2 = Array.isArray(tv);
console.log('tv array or not',isArrayOrNot2);

 const hasSony = tv.includes('sony');
 console.log('using include method',hasSony);

tv.push('toshiba','sharp');
 console.log('after push method ',tv);

 tv.pop();
 console.log('after pop method',tv);

 tv.unshift('lg','insignia');
 console.log('after unshift',tv);
 
tv.shift();
 console.log('after shift method',tv);

tv.splice(1,2,'vizio','hisence');
 console.log('after splice method',tv);

tv.slice(1,3);
  const afterSlice2 = console.log('after slice method',tv);
  console.log('after slice method',afterSlice2);

  const indexOfSony= tv.indexOf('sony');
  console.log('index of sony' ,indexOfSony);

   const stringTv = tv.join('-');
  console.log('after join method', stringTv);
  console.log("===============================================================");



  const games= ['throwball','valleyball','basketball','passball'];
console.log(typeof tv);

const isArrayOrNot3 = Array.isArray(games);
console.log('games array or not',isArrayOrNot3);

 const hasBasketball = games.includes('basketball');
 console.log('using include method',hasBasketball);

games.push('koko','kabaddi');
 console.log('after push method ',games);

games.pop();
 console.log('after pop method',games);

games.unshift('dunkle','cricket');
 console.log('after unshift',games);
 
games.shift();
 console.log('after shift method',games);

games.splice(1,2,'football','tagafar');
 console.log('after splice method',games);

  games.slice(1,3);
  const afterSlice3 = console.log('after slice method',games);
  console.log('after slice method',afterSlice3);

  const indexOfThrowball = games.indexOf('throwball');;
  console.log('index of throwball' ,indexOfThrowball);

   const stringGames = games.join('-');
  console.log('after join method', stringGames);
  console.log("===============================================================");

 
console.log("------------------------------------------------------------------");
  


const fruits = ['apple','orange','mango','banana'];
console.log(typeof(fruits));

const isArrayOrNot4 = Array.isArray(fruits);
console.log('fruits is array or not',isArrayOrNot4);

const hasMango = fruits.includes('mango');
console.log('using include method',hasMango);

fruits.push('grapes','sapota');
console.log('after push method',fruits);

fruits.pop();
console.log('after pop method',fruits);

fruits.unshift('jackfruit','musambi');
console.log('after unshift method',fruits);

fruits.shift();
console.log('after shift  method',fruits);

const indexOfMango = fruits.indexOf('mango');
console.log('index of mango is',indexOfMango);

const stringFruits = fruits.join('-');
  console.log('after join method', stringFruits);

  fruits.splice(1,2,'greenapple','watermelon');
  console.log('after splice method',fruits);
 
   fruits.slice(1,4);
   const afterSlice4 = console.log('after slice method',fruits);
   console.log('after slice method',afterSlice4);

   console.log("========================================");



   const veg = ['tomato','potato','caroot','cucumber'];
   console.log(typeof(veg));

   const isArrayOrNot5 = Array.isArray(veg);
   console.log('veg is array or not',isArrayOrNot5);

   const hasCaroot = veg.includes('caroot');
   console.log('after includes method',hasCaroot);

   veg.push('onion','brinjal');
   console.log('after push method',veg);

   veg.pop();
   console.log('after pop method',veg);

   veg.unshift('pumpkin','beetroot');
   console.log('after unshift method',veg);

   veg.shift();
   console.log('after shift method',veg);

  const stringVeg =  veg.join('-');
  console.log('after join method',stringVeg);

  veg.splice(1,2,'cabbage','califlower');
  console.log('after splice method',veg);
 
   veg.slice(1,4);
   const afterSlice5 = console.log('after slice method',veg);
   console.log('after slice method',afterSlice5);

   console.log("========================================");

   const car= ['audi','bmw','ford','benz'];
   console.log(typeof(car));

   const isArrayOrNot6 = Array.isArray(car);
   console.log('veg is array or not',isArrayOrNot6);

   const hasFord = car.includes('ford');
   console.log('after includes method',hasFord);

   car.push('renualt','volksvagon');
   console.log('after push method',car);

   car.pop();
   console.log('after pop method',car);

  car.unshift('tata','honda');
   console.log('after unshift method',car);

   car.shift();
   console.log('after shift method',car);

  const stringCar =  car.join('-');
  console.log('after join method',stringCar);

  car.splice(1,2,'maruthi','jaguar');
  console.log('after splice method',car);
 
  car.slice(1,4);
   const afterSlice6 = console.log('after slice method',car);
   console.log('after slice method',afterSlice6);

   console.log("========================================");


   const movies = ['arya','dattha','kalasipalya','pailwan'];
   console.log(typeof(movies));

   const isArrayOrNot7 = Array.isArray(movies);
   console.log('veg is array or not',isArrayOrNot7);

   const hasPailwan = movies.includes('pailwan');
   console.log('after includes method',hasPailwan);

   movies.push('kurukshethra','ayya');
   console.log('after push method',movies);

  movies.pop();
   console.log('after pop method',movies);

   movies.unshift('viraat','robert');
   console.log('after unshift method',movies);

   movies.shift();
   console.log('after shift method',movies);

  const stringMovies =  movies.join('-');
  console.log('after join method',stringMovies);

  movies.splice(1,2,'mandya','kencha');
  console.log('after splice method',movies);
 
   movies.slice(1,4);
   const afterSlice7 = console.log('after slice method',movies);
   console.log('after slice method',afterSlice7);

   console.log("========================================");


   const brands = ['bisleri','kinley','aqua','kingfisher'];
   console.log(typeof(brands));

   const isArrayOrNot8 = Array.isArray(brands);
   console.log('brands is array or not',isArrayOrNot8);

   const hasAqua =brands.includes('aqua');
   console.log('after includes method',hasAqua);

   brands.push('bailey','oxyrich');
   console.log('after push method',brands);

  brands.pop();
   console.log('after pop method',brands);

  brands.unshift('aquafina','vedica');
   console.log('after unshift method',brands);

 brands.shift();
   console.log('after shift method',brands);

  const stringBrands=  movies.join('-');
  console.log('after join method',stringBrands);

  brands.splice(1,2,'tata water','manikchand');
  console.log('after splice method',movies);
 
   movies.slice(1,4);
   const afterSlice8 = console.log('after slice method',movies);
   console.log('after slice method',afterSlice8);

   console.log("========================================");




   const items = ['bag','bottle','book','pen'];
   console.log(typeof(items));

   const isArrayOrNot9 = Array.isArray(items);
   console.log('items is array or not',isArrayOrNot9);

   const hasItem = items.includes('pen');
   console.log('after includes method',hasItem);

   items.push('pensic','eraser');
   console.log('after push method',items);

   items.pop();
   console.log('after pop method',items)
  items.unshift('tiffinbox','sketchpen');
   console.log('after unshift method',items);

  items.shift();
   console.log('after shift method',items);

  const stringItems =  items.join('-');
  console.log('after join method',stringItems);

  items.splice(1,2,'lunchbox','colorpencil');
  console.log('after splice method',items);
 
  items.slice(1,4);
   const afterSlice9 = console.log('after slice method',items);
   console.log('after slice method',afterSlice9);

   console.log("========================================");

   const chocalate = ['kikat','dairymilk','galaxy','cadbury'];
   console.log(typeof(chocalate));

   const isArrayOrNot10 = Array.isArray(chocalate);
   console.log('chocalate is array or not',isArrayOrNot10);

   const hasCadbury = chocalate.includes('cadbury');
   console.log('after includes method',hasCadbury);

   chocalate.push('bounty','toblerone');
   console.log('after push method',veg);

   chocalate.pop();
   console.log('after pop method',chocalate);

   chocalate.unshift('imli','butlers');
   console.log('after unshift method',chocalate);

   chocalate.shift();
   console.log('after shift method',chocalate);

  const stringChocalate =  chocalate.join('-');
  console.log('after join method',stringChocalate);

  chocalate.splice(1,2,'lindberg','silk');
  console.log('after splice method',chocalate);
 
   chocalate.slice(1,4);
   const afterSlice10 = console.log('after slice method',chocalate);
   console.log('after slice method',afterSlice10);

   console.log("========================================");

   





 









