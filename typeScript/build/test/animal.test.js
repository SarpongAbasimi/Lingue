"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const animal_1 = require("../lib/animal");
describe('Animal', () => {
    describe('When initialied', () => {
        test('is is passed a name', () => {
            let animal = new animal_1.Animal('bam');
            expect(animal.name).toBe('bam');
        });
    });
    describe('move', () => {
        test('that an animal can move a distance', () => {
            let animal = new animal_1.Animal('lob');
            let spyConsole = jest.spyOn(console, 'log');
            animal.move(10);
            expect(spyConsole).toHaveBeenCalledWith('lob moved by 10');
        });
    });
    describe('Dog', () => {
        test('extends Animal', () => {
            expect(animal_1.Dog.prototype).toBeInstanceOf(animal_1.Animal);
        });
        test('a dog has a name', () => {
            let dog = new animal_1.Dog('sam', 5);
            expect(dog.name).toBe('sam');
        });
        test('move', () => {
            let dog = new animal_1.Dog('lv', 3);
            dog.move(6);
            let sypOnConsole = jest.spyOn(console, 'log');
            expect(sypOnConsole).toHaveBeenLastCalledWith('lv moved by 6');
        });
        test('numLegs', () => {
            let dog = new animal_1.Dog('v', 6);
            expect(dog.numLegs()).toBe(6);
        });
    });
});
