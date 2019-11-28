console.log('window object',window);
console.log('This keyword',this);
console.log(this===window);

window.alert('welcome to javascript class');
alert('welcome to UST Global and Test Yantra');

/*let confirmDelete = confirm('Are you sure you want to delete');
console.log('Confirm delete',confirmDelete);*/

confirm('Are you sure you want to delete');

let userName = prompt('what is your name?');
console.log('user Name', userName);

const person = {
    firstName :'Akshatha',
    lastName :'Dj',
    age : 22,
    getName : function(){
        console.log('This keyword',this);
        return this.firstName+ ' ' +this.lastName;
    }
}
 let fullName = person.getName();
 console.log('FullName',fullName)
