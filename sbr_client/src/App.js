import './App.css';
import StudentView from './component/student/StudentsView';
import Home from './Home';

function App() {
  return (
    <div className="App">
      <h2>Welcome to our front end</h2>
      <Home/>
      <StudentView/>
    </div>
  );
}

export default App;
