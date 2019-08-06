"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class Animal {
    constructor(animalName) {
        this.name = animalName;
    }
    move(aDistance) {
        console.log(`${this.name} moved by ${aDistance}`);
    }
}
exports.Animal = Animal;
class Dog extends Animal {
    constructor(name, legs) {
        super(name);
        this._legs = legs;
    }
    numLegs() {
        return (this._legs);
    }
}
exports.Dog = Dog;
