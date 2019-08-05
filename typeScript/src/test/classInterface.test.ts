
import { Car } from '../lib/classInterface';


describe('Car', ()=> {

  describe('car', ()=>{
    test('when car is initialized, must have an empty fuel', ()=>{
      let car = new Car(2);
      expect(car.fuel).toBe('empty')
    });

    test('car has got tyres', ()=>{
      let car = new Car(4);
      expect(car.tyres).toBe(4)
    });

  });

});