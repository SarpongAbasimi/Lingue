"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class Bank {
    constructor() {
        this._initialamount = 0;
    }
    get amount() {
        return this._initialamount;
    }
    deposit(depositAmount) {
        this._initialamount += depositAmount;
    }
    withdraw(withdrawAmount) {
        if (withdrawAmount > this._initialamount) {
            throw ('sorry you don\'t have enough money in your account');
        }
        this._initialamount -= withdrawAmount;
    }
}
exports.Bank = Bank;
