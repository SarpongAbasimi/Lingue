import { generic } from '../lib/generic';

describe('Generic Function', ()=> {
  test('that when passed an argument it returns that argument', ()=>{
    expect(generic('hey')).toBe('hey')
  });
});