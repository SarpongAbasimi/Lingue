"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const interfaces_1 = require("../lib/interfaces");
describe('Interface', () => {
    test('it prints your name full name', () => {
        const myObject = {
            firstName: 'cjris',
            lastName: 'some'
        };
        expect(interfaces_1.name(myObject)).toBe('cjris some');
    });
});
