import { useState } from "react";
import PropTypes from "prop-types";

//if by is not passed by will be 1 by default
export default function CounterButton({ by = 1 ,incrementMethod, decrementMethod}) {

  function incrementCounterFunction() {
    incrementMethod(by);
  }

  function decrementCounterFunction() {
    decrementMethod(by);
  }

  return ( 
    <div className="Counter">
      <div>
        <button className="counterButton" onClick={() => incrementMethod(by)}>
          +{by}
        </button>

        <button className="counterButton" onClick={() => decrementMethod(by)}>
          -{by}
        </button>
      </div>
    </div>
  );
}

CounterButton.propTypes = {
  by: PropTypes.number,
};