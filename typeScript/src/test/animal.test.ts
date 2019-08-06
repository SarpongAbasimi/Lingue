import { Animal, Dog } from  '../lib/animal'

describe('Animal', ()=> {

  describe('When initialied', ()=> {
    test('is is passed a name', ()=> {
      let animal = new Animal('bam');
      expect(animal.name).toBe('bam');
    });
  });

  describe('move', ()=> {
    test('that an animal can move a distance', ()=>{
      let animal = new Animal('lob');
      let spyConsole = jest.spyOn(console, 'log');
      animal.move(10);
      expect(spyConsole).toHaveBeenCalledWith('lob moved by 10');
    });
  });

  describe('Dog', ()=> {
    test('extends Animal', ()=>{
      expect(Dog.prototype).toBeInstanceOf(Animal);
    });

    test('a dog has a name', ()=> {
      let dog = new Dog('sam', 5);
      expect(dog.name).toBe('sam');
    });

    test('move', ()=>{
      let dog = new Dog('lv', 3);
      dog.move(6);
      let sypOnConsole = jest.spyOn(console, 'log');
      expect(sypOnConsole).toHaveBeenLastCalledWith('lv moved by 6')
    });

    test('numLegs', ()=> {
      let dog = new Dog('v', 6);
      expect(dog.numLegs()).toBe(6)
    });

  });

});