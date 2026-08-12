
// function Footer() {
//     return (
// <div>
//     <h1>Footer</h1>
// </div>
//     )

import { useEffect, useState } from "react"

    
// }

const Footer = () => {
    const clickHandler=(e:React.MouseEvent<HTMLButtonElement>)=>{
console.log(e)
    }
const changeHandler = (e:React.ChangeEvent<HTMLInputElement>) =>{
console.log(e)
}
const submitHandler=(e:React.FormEvent<HTMLFormElement>)=> {
console.log(e)
}
const [name,setName] = useState("Test")
// function getdata():{success:true,message:string} {
//     return {
//         success: true,
//         message: "userFetched"
//     }
// }
interface User {
    name:string,
    age:number,
    phone:number
}
interface DataType {
    success:true,data:User[]
}
function getData():DataType {
    return {
        success:true,
        data:[{name:"jayaram",age:23,phone:9090}]
    }
}

useEffect(()=>{
console.log("amount")
},[name])



    return (
        <div>
            <h1>Footer</h1>
            <button onClick={(e)=>clickHandler(e)}>click</button>
            <input type="abc" onChange={changeHandler}/>
            <form onSubmit={submitHandler}>
                <input type="text"/>
                <button type="submit">submit</button>
            </form>
        </div>
       
    )
}
export default Footer