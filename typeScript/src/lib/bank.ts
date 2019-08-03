export class Bank {

  private _initialamount:number

  constructor(){
    this._initialamount = 0
  }

  get amount(){
    return this._initialamount
  }

  deposit(depositAmount: number){
    this._initialamount += depositAmount
  }

  withdraw(withdrawAmount: number){
    if(withdrawAmount > this._initialamount){
      throw('sorry you don\'t have enough money in your account') 
    }
    this._initialamount -= withdrawAmount
  }

}