/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author bresn
 */
public class bankAccount {
    private int balance = 0;
    private final int overdraft;
    
    public bankAccount(int overdraft)
    {
        this.overdraft = overdraft;
    }
    
    void topUp(int amount)
    {
        balance += amount;
    }
    
    void debit(int amount)
    {
        balance -= amount;
    }
    
    int getBalance()
    {
        return balance;
    }
    
    int getOverdraft()
    {
        return overdraft;
    }
}
