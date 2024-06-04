package com.example.bankaccountapp

fun main(){
    val richardBankAccount = BankAccount("Richard Florendo", 3242.10)

    val practiceAccount = BankAccount("Sarah", 0.0)

    practiceAccount.deposit(100.00)
    practiceAccount.withdraw(10.00)
    practiceAccount.deposit(300.00)

    practiceAccount.displayTransactionHistory()
    practiceAccount.acctBalance()
}