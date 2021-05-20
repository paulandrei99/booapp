import React from "react";
import CardComponent from "./CardComponent";
import TopBar from "./TopBar";

function MainComponent() {
  return (
    <span className="mainCompDiv">
      <h3>Hello "UserName"</h3>
      <h4>Welcome to booapp!</h4>
      <div className="cardComponentsDiv">
        <CardComponent />
      </div>
      
    </span>
  );
}

export default MainComponent;
