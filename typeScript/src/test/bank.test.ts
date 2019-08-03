import { Bank } from '../lib/bank';

describe('Bank', ()=> {

  describe('it has an initial amount of 0', ()=> {
    test('that the initial amout is zero', ()=> {
      let bank = new Bank()
      expect(bank.amount).toBe(0)
    });
  });

  describe('deposit', ()=>{
    test('that amount increases by deposited amount', ()=> {
      let bank = new Bank()
      bank.deposit(100)
      expect(bank.amount).toBe(100)
    });
  });

  describe('withdraw', ()=> {
    test('that a user can withdraw an amount', ()=> {
      let bank = new Bank()
      bank.deposit(30)
      bank.withdraw(20)
      expect(bank.amount).toBe(10)
    })

    test('that an error is thrown if user tries to withdraw more than available', ()=>{
      let bank = new Bank()
      bank.deposit(10)
      expect(()=> {
        bank.withdraw(20)
      }).toThrow('sorry you don\'t have enough money in your account')
    });
  });

});