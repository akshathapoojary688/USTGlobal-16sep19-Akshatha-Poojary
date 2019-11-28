/*const hobbies = ['sleeping','cricket','eating','coding','roaming'];
console.log(typeof hobbies);

const isArrayOrNot = Array.isArray(hobbies);
console.log('hobbies array or not',isArrayOrNot);

 const hasCricket = hobbies.includes('cricket');
 console.log('using include method',hasCricket);

 hobbies.push('guitar','vallyball');
 console.log('after push method ',hobbies);

 hobbies.pop();
 console.log('after pop method',hobbies);

 hobbies.unshift('numismatics','singing');
 console.log('after unshift',hobbies);
 
 hobbies.shift();
 console.log('after shift method',hobbies);


 const hobbies1 = ['sleeping','cricket','coding','roaming'];
 hobbies1.splice(1,2,'bird watching','pubg');
 console.log('after splice method',hobbies1);

 hobbies1.slice(2,4);
  const afterSlice = console.log('after slice method',hobbies1);
  console.log('after slice method',afterSlice);

  /*const indexofCoding = hobbies1.indexOf('coding',1);
  console.log('index of coding' ,indexOfCoding);*/

   const stringHobbies = hobbies.join('-');
  console.log('after join method', stringHobbies);

  const numbers = [100,200,300,400];
 const numbers1 =  numbers.map(function(value,index)
  {
      let newValue = value+50;
      return newValue;
  })
  console.log('after map method',numbers1);

  const nums2 = numbers.map(value => value+50)
  console.log('after map arrow function ',nums2);

  const filterNum =  numbers.filter(function(value,index)
  {
      if(value>200){
          return true;
      }else{
          return false;
      }
  })
console.log('after filter method',filterNum);

const filterNumArrow = numbers.filter(value => value>200)
console.log('after filter method using arrow', filterNumArrow);





const hobbies = ['sleeping','cricket','coding','roaming']
hobbies.splice((1,2,'bird watching','pubg'))
console.log(hobbies)
