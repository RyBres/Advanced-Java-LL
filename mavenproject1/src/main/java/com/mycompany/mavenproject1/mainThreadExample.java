/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author bresn
 */
public class mainThreadExample {
    public static void main(String[] args)
    {
        // We can use the following line of code to see how many threads are in
        // use.
        //System.out.println(Thread.activeCount());
        
        threadExample thread1 = new threadExample();
        thread1.setName("My first thread");
        thread1.start(); // Thread-0 is the default name of the thread.
        // When above is run, we can see that the thread is the only one running.
        
        // We can create a new thread, which gives us a multi-thread application.
        threadExample thread2 = new threadExample();
        thread2.setName("My second thread");
        thread2.start();
        
    }
}
