import React, { useEffect, useState } from 'react'
import { listEmployees } from '../services/EmployeeService'
import { useNavigate } from 'react-router-dom'

const ListEmployeeCompontent = () => {

    const [employees,setEmployees]=useState([])

    const navigator=useNavigate();

    useEffect(()=>{
        listEmployees().then((response)=>{
            setEmployees(response.data);
        }).catch(error=>{
            console.error(error);
        })
    },[])
    
    function addNewEmployee(){
        navigator('/add-employee')
    }

  return (
    <div className='container'>
        <h2 className='text-center'>List of Employees</h2>
        <button className='btn btn-primary mb-2'onClick={addNewEmployee}>Add Employee</button>
        <table className='table table-striped table-bordered table-hover border-primary'>
            <thead>
                <tr>
                    <th>Employee ID</th>
                    <th>Employee First Name</th>
                    <th>Employee Last Name</th>
                    <th>Employee Email</th>
                </tr>
            </thead>
            <tbody>
                {
                    employees.map(employee=>
                        <tr key={employee.id}>
                            <td>{employee.id}</td>
                            <td>{employee.firstName}</td>
                            <td>{employee.lastName}</td>
                            <td>{employee.email}</td>

                        </tr>
                    )
                }
            </tbody>
        </table>

    </div>
  )
}

export default ListEmployeeCompontent