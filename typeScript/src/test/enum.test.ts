import { howEnumWork } from '../lib/enum';

describe('Elelment increase by on', ()=>{
  test('all the elements in Enum increase by one', ()=>{
    // let data = {favNumber: 2}
    enum Direction{
      UP=1,
      DOWN,
      RIGHT,
    }
    expect(howEnumWork(Direction.UP)).toBe(1)
    expect(howEnumWork(Direction.DOWN)).toBe(2)
    expect(howEnumWork(Direction.RIGHT)).toBe(3)
  });
});