import { useState } from 'react';
import './Counter.css'

export default function Counter(){

    //[0,f]
    const state = useState(0)

    function incrementCounterFunction(){
        var cnt=
        state[1](state[0]+1);
    }

    return (
        <div className="Counter">
            <span className="count">{state[0]}</span>
            <div>
                <button className="counterButton" 
                    onClick={incrementCounterFunction}
                >+1</button>
            </div>
        </div>
    )
}