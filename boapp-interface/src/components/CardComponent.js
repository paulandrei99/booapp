import React, { Component } from "react";
import {GoLocation} from "react-icons/go";
// function CardComponent(){
//     return(
//         <div className="cardDiv">
//             <img className="cardImg" src="http://placekitten.com/600/500" ></img>
//             <h2>Hawaii House</h2>
//             <p>Some quick example text to build on the card title and make up the bulk of the card's content.</p>
//             <button>Go somewhere</button>
//         </div>
//     )
// }

class CardComponent extends Component {
  state = {
    isLoading: true,
    Locations: [],
  };

  async componentDidMount() {
    const response = await fetch("/location/getAllLocations");
    const body = await response.json();
    this.setState({ Locations: body, isLoading: false });
  }

  render() {
    const { Locations, isLoading } = this.state;
    if (isLoading) return <div>Loading...</div>;

    return ( 
      <div className="dddd">
      {/* <div className="d-flex flex-wrap ">  */}
        {Locations.map((location) => (
          <div className="cardDiv">
            <div className="text-center">
              <img
                className="cardImg "
                src={location.image}
              ></img>
            </div>
            <h3 className="text-center">{location.name}</h3>
            <h5>{location.county}</h5>
            <h6><GoLocation />{location.city}</h6>
            <p className="text-center">{location.about}</p>
            <div className="text-center">
              <button className="btn btn-outline-warning">Book now</button>
            </div>
          </div>
        ))}
      </div>
    );
  }
}

export default CardComponent;
