import React from "react"
import { Navbar, Nav, NavItem, NavDropdown, MenuItem , Button , Form , FormControl, Row, Container} from "react-bootstrap";
import { Gi3DMeeple } from "react-icons/gi";

function TopBar(){
    return(
        <div>
            <Navbar className="d-flex justify-content-between bg-warning ">
                  <a href="http://localhost:3000" > <Gi3DMeeple /> Booapp</a>
                  <div className="searchContainer">
                    <input className="searchLabel form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" />
                    <Button className="searchButton btn btn-outline-success my-2 my-sm-0" type="submit">Go!</Button> 
                  </div>
                  <a href="">Register your property</a>     
                  <a href="http://localhost:8080/login?logout">Logout</a>     
            </Navbar>
        </div>
    )
}

export default TopBar