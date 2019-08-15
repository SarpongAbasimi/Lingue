
export const generic = <T> (userInput: T) : T => {
  return userInput
};

export const genericType = <T> (userInput: T[]): T[] => {
  return userInput
};


export const arrayLenght = <T>(params: T[]): T[] => {
  console.log(params.length)
  return params
}
