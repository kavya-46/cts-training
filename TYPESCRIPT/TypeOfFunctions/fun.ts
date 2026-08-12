function dis(){
    console.log("welcome to named fucntion")
}
dis()

function dis2(x:number,y:number) {
    console.log(x+y)
}
dis2(3,4)

//anonymous function
var ann= function() {
    console.log("anony")
}
ann()

var ann1=function(a:number,b:number):number {
    return a*b;
}
console.log(ann1(2,5))

//optional 
//optional parameter, default parameter
// function greety(name:string, name2?:string) {
//     return name+" "+name2;

// }
// console.log(greety("a"))


//default parameter
function gree(name:string, name2:string="helloguys") {
    return name+" "+name2;

}
console.log(gree("a"))
console.log(gree("a","b"))
