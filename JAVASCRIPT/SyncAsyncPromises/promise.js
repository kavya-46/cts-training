// let a = 10,
// b=20;
// let result=a+b;
// console.log(result);

// setTimeout(()=>{
// console.log("hello")
// },2000)
// //asynchronus ops
// console.log("hello2") //it is first executed




//PROMISES:
// function prepareFood() {
//     setTimeout(()=>{
// console.log('Food is prepared');
//     },3000)
// }


// function eatFood() {
//     setTimeout(()=>{
//         console.log("Food is eated");
//     },2000);
// }

// function goToSchool() {
// setTimeout(()=>{
//     console.log("Went to school");
// },1500);
// }

// prepareFood();
// eatFood();
// goToSchool();



//NESTED CALL BACK

// function prepareFood(next) {
//     setTimeout(()=>{
// console.log('Food is prepared');
// next();
//     },3000);
// }

// function eatFood(next) {
//     setTimeout(()=>{
// console.log("Food is eated");
// next();
//     },2000);
// }

// function goToSchool() {
// setTimeout(()=>{
//     console.log("Went to school");
// },1500);
// }

// prepareFood(()=>{
//     eatFood(()=>{
//         goToSchool();
//     });
// });


//SEQUENCE IN THE FUNCTIONS
// function prepareFood(next) {
//     setTimeout(()=>{
// console.log('Food is prepared');
// next();
//     },3000);
// }

// function eatFood(next) {
//     setTimeout(()=>{
// console.log("Food is eated");
// next();
//     },2000);
// }

// function goToSchool() {
// setTimeout(()=>{
//     console.log("Went to school");
// },1500);
// }

// prepareFood(()=>{
//     eatFood(()=>{
//         goToSchool();
//     });
// });




function prepareFood() {
    return new Promise((resolve, reject)=>{
        setTimeout(() => {
resolve("food is prepared");
        },3000);    
    });
}

function eatFood() {
    return new Promise((resolve, reject)=> {
        setTimeout(()=> {
             resolve("Food is Eaten");
        },2000);
    });
}

function goToSchool() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve("Went to school");
        },1500);
    });
}


prepareFood().  //starts preparing food
then((value)=>{
    //food is prepared
    console.log(value); //food is Prepared Food
    return eatFood();  // starts eating food
})
.then((value)=>{ 
    // value here is what eatFood resolved
    console.log(value); //Food is Eaten

return goToSchool();
}).then((value)=>{
    console.log(value); //went to school
    console.log("all promises are resolved")
})
// prepareFood(()=>{
//     eatFood(()=>{
//         goToSchool();
//     });
// });