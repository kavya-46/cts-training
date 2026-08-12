import './App.css'
import Header from './components/Header'
import Footer from './components/Footer'
import UseRefComp from './components/UseRefComponent'
type Data = {
  name:string,
  age:number,
  phone:number
  data:number[]
}

type strNum = string|number

interface DataObjInterface {
   name:string,
  age:number,
  phone:number
  data:number[]
}

function App() {
  let name:string="konduru"
  name="5"
console.log(name)
const isLogin:boolean = true;
const data:number[] =[1,2,3,4,5]
console.log(data)
// const dataObj={name:"kavya",age:20}
// console.log(dataObj)
const dataObj: {
  name:string,
  age:number,
  phone:number
  data:number[]
}={name:"johnsena", age:25,phone:231234,data:[1,2,3,4,4,5]}
console.log(dataObj)

const numStr:strNum = "qwerty";

const dataO:DataObjInterface = {name:"konduru",age:22,phone:2434324,data:[1,2,3,4,4]}

  return (
    <div> 
      <Header logoName="cognizant" logoUrl='www.google.com'/>
<UseRefComp/>
      <h1>hello world</h1>
      <Footer/>
      <h2>{name}</h2>
      </div>
      )
    }
    export default App