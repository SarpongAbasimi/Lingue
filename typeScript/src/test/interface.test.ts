import { name } from '../lib/interfaces'

describe('Interface', ()=> {
  test('it prints your name full name', ()=> {

    const myObject = {
      firstName: 'cjris',
      lastName: 'some'
    }
    expect(name(myObject)).toBe('cjris some')
  });
});