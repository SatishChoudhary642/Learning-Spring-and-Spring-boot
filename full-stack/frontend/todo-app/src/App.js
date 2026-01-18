import './App.css';
import Counter from './components/counter/Counter';
import LearningComponent from './components/learning-examples/LearningComponent';

function App() {
  return (
    <div className="App">
      <Counter/>
      <Counter by={2}/>
      <Counter by={3}/>
    </div>
  );
}

export default App;
