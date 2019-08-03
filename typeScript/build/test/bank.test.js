"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const bank_1 = require("../lib/bank");
describe('Bank', () => {
    describe('it has an initial amount of 0', () => {
        test('that the initial amout is zero', () => {
            let bank = new bank_1.Bank();
            expect(bank.amount).toBe(0);
        });
    });
    describe('deposit', () => {
        test('that amount increases by deposited amount', () => {
            let bank = new bank_1.Bank();
            bank.deposit(100);
            expect(bank.amount).toBe(100);
        });
    });
    describe('withdraw', () => {
        test('that a user can withdraw an amount', () => {
            let bank = new bank_1.Bank();
            bank.deposit(30);
            bank.withdraw(20);
            expect(bank.amount).toBe(10);
        });
    });
});
