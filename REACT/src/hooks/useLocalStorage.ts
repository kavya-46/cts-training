//custom hook

function useLocalStorgae<T>(key:string, intialValue:T) {
    const[value,setValue] = useState<T> (()=> {
        try{
            const stored = localStorage.getItem(key)
            return stored ? JSON.parse(stored) as T): intialValue
        } catch {
            return intialValue
        }
    })
    const setStoredValue =(newValue: T)=> {
        try {
            setValue(newValue)
            localStorage.setItem(Key, JSON.stringify(newValue))
        } catch(err) {
            console.log('Error saving in localStore', err)
        }
    }
    return [Value ,setStoredValue] as const
}
useLocalStorgae('test')