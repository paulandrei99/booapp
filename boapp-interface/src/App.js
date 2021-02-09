import logo from './logo.svg';
import React from 'react';
import './App.css';
import Topbar from './components/Topbar';
import MainPageComponent from './components/main/Page';
function App() {
  return (
    <React.Fragment>
        <Topbar />
        <MainPageComponent />
    </React.Fragment>
  );
}

export default App;
