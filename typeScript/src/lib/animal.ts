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
}