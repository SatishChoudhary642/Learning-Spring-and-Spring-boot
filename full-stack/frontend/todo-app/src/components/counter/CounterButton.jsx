import { useState } from "react";
import PropTypes from "prop-types";

//if by is not passed by will be 1 by default
export default function CounterButton({ by = 1 ,incrementMethod, decrementMethod}) {
  //[0,f]
  const [count, setCount] = useState(0);

  function incrementCounterFunction() {
    incrementMethod(by);
    setCount(count + by);
  }

  function decrementCounterFunction() {
    decrementMethod(by);
    setCount(count - by);
  }

  return (
    <div className="Counter">
      <div>
        <button className="counterButton" onClick={incrementCounterFunction}>
          +{by}
        </button>

        <button className="counterButton" onClick={decrementCounterFunction}>
          -{by}
        </button>
      </div>
    </div>
  );
}

CounterButton.propTypes = {
  by: PropTypes.number,
};