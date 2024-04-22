//given arr [12,34,66]console it using fun print forCast like 12C in 1 days...34C in 2 days...66C in 3 days


// function forCast(arr){
//     for(let i=0;i<arr.length;i++){
//         console.log(`... ${arr[i]}C in ${i+1}days...`);
//     }
// }
const forCast=function(arr){
     let str=' ';
     for(let i=0;i<arr.length;i++){
     str=str+`${arr[i]}C in ${i+1}days...`
}
   console.log(`...`+str)
}

const nums=[12,34,66,76];
forCast(nums);