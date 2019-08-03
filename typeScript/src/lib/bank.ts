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
    this._initialamount -= withdrawAmount
  }

}