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
      let animal = new Animal('lob')
      let spyConsole = jest.spyOn(console, 'log')
      animal.move(10)
      expect(spyConsole).toHaveBeenCalledWith('lob moved by 10')
    });
  });

  describe('Dog', ()=> {
    test('extends Animal', ()=>{
      expect(Dog.prototype).toBeInstanceOf(Animal);
    });

    test('a dog has a name', ()=> {
      let dog = new Dog('sam');
      expect(dog.name).toBe('sam')
    });
  });

});