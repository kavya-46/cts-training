// let a = 10,
// b=20;
// let result = a+b;
// console.log(result);

// setTimeout(()=>{
// console.log("hello")
// },3000) //1000ms = 1 sec

// console.log("hi")


//EXAMPLE FLOW: 
//PREPAREFOOD() -> EATFOOD() -> GOTOSCHOOL()

//callback pattern in Javascript

// function prepareFood(next) {
// setTimeout(()=>{
// console.log("food is prepared");
// next();
// },3000);
// }

// function eatFood(next) {
// setTimeout(()=>{
// console.log("food is eaten");
// next();
// },2000);
// };

// function goToSchool() {
// setTimeout(()=>{
// console.log("going to school");
// },1500);
// }

// prepareFood(()=>{
//     eatFood(()=>{
//         goToSchool();
//     });
// });


//refactor this using sync, async and promises



function prepareFood() {
    let isFoodReady = true;
    return new Promise((resolve,reject)=>{
setTimeout(()=>{
   // if(isFoodReady===true)
   if(isFoodReady) {
resolve("food is prepared");
   } else {
reject("Failed to prepare food");
   }

},3000);
    });
}

function eatFood() {
    let isFoodEaten= true;
        return new Promise((resolve,reject)=>{
setTimeout(()=>{
    if(isFoodEaten) {
resolve("food is eaten");
    } else {
        reject("didnt eat food");
    }
},2000);
});
};

function goToSchool() {
    let isSchoolOpen = false;
        return new Promise((resolve,reject)=>{
setTimeout(()=>{
    if(isSchoolOpen) {
resolve("going to school");
    } else {
        reject("school is closed")
    }
},1500);
});
}

prepareFood().then((value)=>{
    console.log(value);
return eatFood();
}).then((value)=>{
    console.log(value);
return goToSchool();
}).then((value)=>{
    console.log(value);
    console.log("all promises completed ")

}).catch((error)=>{
console.log(error);
}).finally(()=>{
    console.log("all promises resolved");
})


