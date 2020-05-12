let a: number = 1 + 2;
let b: number= a + 3;
let c = {
  apple: a,
  banana: b
};

let d = c.apple * 4;

console.log(d);

// objects

let an: {b: number}= {
  b: 4
}
const mb: {c: number} = {
  c: 5
}

const nbv: number =9 
console.log(an.b)

// type alias

type Age= number

type Person = {
  name: string,
  age: Age
}


let ta:  Person = {
  name: 'dfdfd',
  age: 4
}

let ar: number[] = [1,2,3,4,5]

enum Language {
  Spanish,
  Italain
}

console.log(Language.Spanish)
console.log(Language.Italain)

type Person_1 =  {
  name: string,
  age: number
}

const someFuction = (aString: string, aPersonType: Person_1 = {name: 'dvd', age: 9}): void => {
  console.log(aString)
  console.log(aPersonType.name)
}

someFuction('personName')

type SomthingGood = {
  <T>(a: T): String
}

abstract class Todo {
  abstract todo(someTodo: string):string
}

class C extends Todo {
  todo(someTodo: string){
    return 'dfdfd'
  }
}