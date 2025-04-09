import './App.css'
import FooterComponent from './components/FooterComponent'
import HeaderComponent from './components/HeaderComponent'
import ListEmployeeCompontent from './components/ListEmployeeCompontent'
import EmployeeComponent from './components/EmployeeComponent'
import {BrowserRouter,Routes,Route} from 'react-router-dom'



function App() {
  

  return (
    <>
      <BrowserRouter>
        <HeaderComponent/>
          <Routes>
            {/* //http://localhost:3000 */}
            <Route path='/' element={<ListEmployeeCompontent/>}></Route>
            {/* //http://localhost:3000/employees */}
            <Route path='/employees' element={<ListEmployeeCompontent/>}></Route>
            {/* //http://localhost:3000/add-employee */}
            <Route path='/add-employee' element={<EmployeeComponent/>}></Route>
          </Routes>
        <FooterComponent/>
      </BrowserRouter>
    </>
  )
}

export default App
