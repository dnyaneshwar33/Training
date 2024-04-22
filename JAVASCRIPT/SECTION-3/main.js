//Arrays
const friends=['jay','VD','SHyam'];
friends.push('JD');//Adds the elements at the last position
console.log(friends);
friends.unshift('KD');//Adds ele at first pos
console.log(friends);

//removing Element
const rem=friends.pop();//removes last element
console.log(friends);
console.log(rem);

friends.shift();//Removes first ele
console.log(friends);

console.log(friends.indexOf('VD'));

//Object
const john={
    name:"VD",
    marks:98,
    job:"Student",
    friends:['KS','ram','Shyam']

}
console.log(john);
console.log(john.friends)
const property=prompt('What u want to know');//will work on browser
if(john[property]){
    console.log(`${property} is ${john[property]}`)
}
else{
    alert('No property found');
}