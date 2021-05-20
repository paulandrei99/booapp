import './App.css';
import './index.css';
import MainComponent from './components/MainComponent';
import TopBar from './components/TopBar';
import UserComponent from './components/UserComponent';
import Category from './Category'
import hotelImage from "./assets/hotelImage.jpg"

function App() {
  return (
    <div className="bgImg">
   {/* <div className="bgImg" style={{ backgroundImage: `url(${hotelImage})`,
    backgroundSize: 'cover' }}> */}
      <TopBar />
      <MainComponent /> 
      {/* <UserComponent /> */}
      {/* <Category /> */}
    </div>
  )
}

export default App;
