import React, { useEffect } from 'react';
import { useState } from 'react';
import './App.css';
import { Data } from './components/Data';

const App = () => {

  interface DataStructure {
    userId: number;
    it: number;
    title: string;
    body: string;
  }

  const [initial, setInitial] = useState<DataStructure | {}>({})

  interface DataStructure {
    userId: number;
    it: number;
    title: string;
    body: string;
  }
  const getData: Promise<DataStructure> = () => {
    const url: string = "https://jsonplaceholder.typicode.com/posts/1" 
    return fetch(url)
    .then(res => {
      if(res.status == 200){
        return res
      }
    })
  };

  useEffect(()=> {
    getData().then(response => setInitial(response))
  }, []);

  console.log(initial)
  return (
    <div className="App">
      <Data name="kk" />
    </div>
  );
}

export default App;
