import { generic, genericType } from '../lib/generic';

describe('Generic Function', ()=> {
  test('that when passed an argument it returns that argument', ()=>{
    expect(generic('hey')).toBe('hey')
  });

  test('that you can specify type of generic', ()=> {
    expect(genericType([])).toBeInstanceOf(Array)
  });
});