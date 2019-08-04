"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.name = (userName) => {
    return (`${userName.firstName} ${userName.lastName}`);
};
const myObject = { firstName: 'hey', lastName: 'yes' };
