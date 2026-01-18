import { useState } from 'react';
import PropTypes from 'prop-types';
import './Counter.css'

//if by is not passed by will be 1 by default
export default function Counter({by=1}){

    //[0,f]
    const [count, setCount] = useState(0)

    function incrementCounterFunction(){
        setCount(count + by);
    }

    function decrementCounterFunction(){
        setCount(count - by);
    }


    return (
        <div className="Counter">
            <span className="count">{count}</span>
            <div>
                <button className="counterButton" 
                    onClick={incrementCounterFunction}
                >+{by}</button>

                <button className="counterButton" 
                    onClick={decrementCounterFunction}
                >-{by}</button>
            </div>
        </div>
    )
}

Counter.propTypes={
    by: PropTypes.number
}