import { generic, genericType, arrayLenght } from '../lib/generic';

describe('Generic Function', ()=> {
  test('that when passed an argument it returns that argument', ()=>{
    expect(generic('hey')).toBe('hey');
  });

  test('that you can specify type of generic', ()=> {
    expect(genericType([])).toBeInstanceOf(Array);
  });

  test('that array properties can be available on generis', ()=> {
    const mySpy = jest.spyOn(console, 'log');
    let myArray = [1,2,3,4,5];
    expect(arrayLenght(myArray)).toBe(myArray)
    expect(mySpy).toHaveBeenCalled()
    expect(mySpy).toHaveBeenCalledWith(5)
  });
  
});
