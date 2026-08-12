import { useState } from "react"

type HeaderProps = {
    logoName?:string, //optional (?)
    logoUrl:string
}

function Header({logoName="test",logoUrl}:HeaderProps) {
    const [name,setName] = useState<string>("kavya")
    const[num,setNum]= useState<number>(9)
    setName("kavya")
    setNum(9)
interface DataInterface{
    name:string
    age:number
}
const [arr,setArr] = useState<number[]>([1,2,3,4])
// const [data,setData] = useState<DataInterface>({name:"kavya",age:90})
//     const [data,setData] = useState<{name:string,age:number}>({name:"kabu",age:22})

    return (
        <div>
            <h1>{logoName ? logoName:'test'}-Header</h1>
   
        </div>
    )
}
export default Header