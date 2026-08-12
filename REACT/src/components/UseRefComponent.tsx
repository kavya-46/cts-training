import {useEffect, useRef} from "react";

const UseRefComp =() => {

const myRef= useRef<HTMLDivElement>(null)

useEffect(()=>{
    if(myRef.current) {
        myRef.current.innerText='test'
    }
},[])
    return (
        <div ref={myRef}>
            Use REf comp
        </div>
    )
}

export default UseRefComp;