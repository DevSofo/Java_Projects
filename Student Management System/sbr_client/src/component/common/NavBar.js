import React from 'react'
import { Link } from 'react-router-dom'

const NavBar = () => {
  return (

  <nav className="navbar navbar-expand-lg bg-dark mb-5">
    <div className="container-fluid">
      <Link className="text-white navbar-brand" to={"/"}>
    SBR Application
      </Link>
      <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span className="navbar-toggler-icon"></span>
      </button>
      <div className="collapse navbar-collapse" id="navbarNav">
      <ul className="navbar-nav">
        <li className="nav-item">
          <Link className="text-white nav-link active" aria-current="page" to={"/view-students"}>
          View All Students
          </Link>
        </li>
        <li className="nav-item">
          <Link className="text-white nav-link" to={"/add-students"}>Add New Student</Link>
        </li>
      </ul>
    </div>
  </div>
</nav>

  )
}

export default NavBar