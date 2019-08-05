interface NameInterface {
  firstName: string;
  lastName: string;
}

export const name = (userName: NameInterface ) : string => {

  return(`${userName.firstName} ${userName.lastName}`)
}

const myObject = { firstName: 'hey', lastName: 'yes'}

// Example two

interface Fruits {
  favFruit?: string;
  leastFavFruit?: string
}

const whatIsYourFacFruit = (userInput: Fruits): { favFruit: string; leastFavFruit:string } => {
  let FruitObject = { favFruit: 'apple', leastFavFruit: 'banana'}
  if(userInput.favFruit) {
    FruitObject.favFruit = userInput.favFruit
  }
  if(userInput.leastFavFruit){
    FruitObject.leastFavFruit = userInput.leastFavFruit
  }
  return FruitObject
} 