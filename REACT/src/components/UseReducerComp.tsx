import { useReducer } from "react"

type Props = {
    name ?: string
}
type State = {
    count: number
}
type Actions = | {type:'increment'} | {type:'decrement'} | {type:'reset'}
function reducer(state:State, action:Actions) {
switch(action.type) {
    case 'increment':
        return {count: state.count+1}
    case 'decrement':
        return {count: state.count-1}
    case 'reset':
        return {count: 0}
        default:
            return state
}
}
const UseReducerComp:React.FC<props>=({name})=>{
    const [state,dispatch] = useReducer(reducer, {count: 0})
    return(
        <div>
            User Reducer Comp {name ? name:' '}
            <div>
                <button onClick={(()=>dispatch({type:'decrement'}))}>-</button>
                <span>{state.count}</span>
                <button onClick={(()=>dispatch({type:'increment'}))}>-</button>
                <button>+</button>
                <button>Reset</button>
            </div>
        </div>
    )
}