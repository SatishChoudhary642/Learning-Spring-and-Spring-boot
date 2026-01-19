import { useState } from "react";

import "./Counter.css";
import CounterButton from "./CounterButton";
import ResetButton from "./ResetButton";

export default function Counter() {
  const [count, setCount] = useState(0);

  function incrementCounterParentrFunction(by){
    setCount(count + by)
  }

  function decrementCounterParentrFunction(by){
    setCount(count - by)
  }

  function ResetCounter(){
    setCount(0)
  }

  return (
    <>
      <span className="totalCount">{count}</span>
      <CounterButton incrementMethod={incrementCounterParentrFunction} decrementMethod={decrementCounterParentrFunction}/>
      <CounterButton by={2} incrementMethod={incrementCounterParentrFunction} decrementMethod={decrementCounterParentrFunction}/>
      <CounterButton by={3} incrementMethod={incrementCounterParentrFunction} decrementMethod={decrementCounterParentrFunction}/>
      <ResetButton resetMethod={ResetCounter}/>
    </>
  );
}