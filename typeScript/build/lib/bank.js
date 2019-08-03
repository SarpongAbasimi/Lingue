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
        this._initialamount -= withdrawAmount;
    }
}
exports.Bank = Bank;
