// //destructring arrays

// const arr=[12,34,55,78];
// //old method of accessing
// const a=arr[0];
// const b=arr[1];
// const c=arr[2];

// //new
// const[x,y,z]=arr;
// console.log(x,y,z);


// //destructring objects
// const person={
//     name:'VD',
//     age:12,
//     marks:[98,87]


// }

// const names=person.name;
// console.log(names);
// //new
// const {name,age,marks}=person;
// console.log(name,age,marks);

//spread operators
const nums=[34,23,87];
const newNums=[12,54,nums[0],nums[2]];
console.log(newNums)

//using spread
const newArr=[98,83,...nums];
console.log(newArr)
//join two arrays

const addArr=[...newArr,...newNums]
console.log(addArr);

//for of loop
const items=[12,34,665,87,33];
for(item of items) console.log(item);

//set data structure=unique values
const orderSet=new Set([
    "pizza",
    "Burger",
    "Coke",
    "Burger",
    "Pizza"
]);
console.log(orderSet);
orderSet.add("Vadapav");
orderSet.delete("pizza")
console.log(orderSet);
console.log(orderSet.has("Coke"))

//Map data structure=store values in key:value pair
const info =new Map();
info.set('name',"VD");
info.set("marks",98)
console.log(info)
console.log(info.size)