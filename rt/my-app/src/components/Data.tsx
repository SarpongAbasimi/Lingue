import React from 'react';

interface DataStructure {
  userId: number;
  it: number;
  title: string;
  body: string;
}

interface PropsLooks {
  name: string;
}

export const Data:React.FunctionComponent<PropsLooks> = (props) => {
return <div>Hello {props.name}</div>
}