export class Animal{
  name: string
  constructor(animalName: string){
    this.name = animalName
  }

  move(aDistance:number){
    console.log(`${this.name} moved by ${aDistance}`)
  }
}

export class Dog extends Animal{
  private _legs: number;
  constructor(name: string, legs: number){
    super(name);
    this._legs = legs;
  }

  numLegs(){
    return(this._legs);
  }
}