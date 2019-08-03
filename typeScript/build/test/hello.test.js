"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const hello_1 = require("../lib/hello");
describe('hello', () => {
    test('that is returns hello', () => {
        expect(hello_1.hello()).toBe('hello');
    });
});
