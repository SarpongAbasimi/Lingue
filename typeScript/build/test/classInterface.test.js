"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const classInterface_1 = require("../lib/classInterface");
describe('Car', () => {
    describe('car', () => {
        test('when car is initialized, must have an empty fuel', () => {
            let car = new classInterface_1.Car(2);
            expect(car.fuel).toBe('empty');
        });
        test('car has got tyres', () => {
            let car = new classInterface_1.Car(4);
            expect(car.tyres).toBe(4);
        });
    });
});
