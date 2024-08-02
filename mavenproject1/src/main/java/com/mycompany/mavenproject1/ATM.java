/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author bresn
 */
public class ATM {
    // We make the method synchronized so it can run on multiple threads.
    // This way, it won't make errors related to running multithread process.
    static synchronized void withdraw(bankAccount account, int amount)
    {
        int balance = account.getBalance();
        if((balance - amount) < - account.getOverdraft())
        {
            System.out.println("Transaction denied");
        } else {
            account.debit(amount);
            System.out.println("$" + amount + " successfully withdrawn");
        }
        System.out.println("Current balance: " + account.getBalance());
    }
}
