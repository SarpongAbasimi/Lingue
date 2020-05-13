import React from "react";
import './SearchBar.css';

export const SearchBar: React.FunctionalComponent= () => {
  return (<div className="searchBar">
    <input className='searchField' type='text' placeholder='search'></input>
  </div>)
}