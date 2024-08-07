import React from "react"
import './Header.css'
import { Bat } from "./icons/Bat"

function Header(){
    const iconBig = {
        width: '180px',
        height: '180px'
    };
    return(
        <div className="header-container">

        <h1>Little Tittle - Component</h1>
        <h2>Even Smaller Title - Component</h2>
        <Bat style={iconBig}/>
        </div>
    )
}

export default Header