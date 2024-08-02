/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author bresn
 */
public class Kitchen {
    // This is an example of a deadlocked thread. It will run forever, with each
    // thread interfering with the other's execution of the code blocks.
    public static Object spoon = new Object();
    public static Object bowl = new Object();
    
    public static void main(String[] args)
    {
        Thread cook1 = new Thread(() -> 
        {
            synchronized (spoon) 
            {
                System.out.println("Cook1: Holding the spoon...");
                System.out.println("Cook1: waiting for the bowl...");
                
                synchronized (bowl)
                {
                    System.out.println("Cook1: Holding the spoon and the bowl.");
                }
            }
        });
        
        Thread cook2 = new Thread(() -> {
            synchronized (bowl) {
                System.out.println("Cook2: Holding the bowl...");
                System.out.println("Cook2: Waiting for the spoon...");
                
                synchronized (spoon)
                {
                    System.out.println("Cook1: Holding the spoon and the bowl.");
                }
            }
        });
        
        cook1.start();
        cook2.start();
    }
}
