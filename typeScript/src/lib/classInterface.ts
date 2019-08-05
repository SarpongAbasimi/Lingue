interface CarInterface {
  fuel: string
  tyres: number
}

export class Car implements CarInterface {
  fuel: string; tyres:number;

  constructor(numOfTyres:number){
    this.fuel = 'empty'
    this.tyres = numOfTyres
  }
}