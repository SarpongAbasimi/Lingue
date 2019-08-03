import { hello } from '../lib/hello'

describe('hello', ()=> {
  test('that is returns hello', ()=> {
    expect(hello()).toBe('hello')
  });
});