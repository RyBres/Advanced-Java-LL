/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author bresn
 */
public class Users {
    static final bankAccount account = new bankAccount(50);
    
    public static void main(String[] args)
    {
        account.topUp(100);
        
        Thread t1 = new Thread(() -> {
            ATM.withdraw(account, 100);
        });
        
        Thread t2 = new Thread(() -> {
            ATM.withdraw(account, 100);
        });
        
        t1.start();
        t2.start();
    }
}
