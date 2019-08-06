"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.name = (userName) => {
    return (`${userName.firstName} ${userName.lastName}`);
};
const myObject = { firstName: 'hey', lastName: 'yes' };
const whatIsYourFacFruit = (userInput) => {
    let FruitObject = { favFruit: 'apple', leastFavFruit: 'banana' };
    if (userInput.favFruit) {
        FruitObject.favFruit = userInput.favFruit;
    }
    if (userInput.leastFavFruit) {
        FruitObject.leastFavFruit = userInput.leastFavFruit;
    }
    return FruitObject;
};
