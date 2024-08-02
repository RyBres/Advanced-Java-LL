/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author bresn
 */
public class mainGreetingMessage implements greetingMessage {
    public static void main(String[] args)
    {
        greetingMessage gm = new greetingMessage()
        {
            @Override
            public void greet(String name)
            {
                System.out.println("Hello " + name);
            }
        };
        gm.greet("Bethan");
        
        // Method below implements same w/ a lambda, which removes some
        // boilerplate
        greetingMessage gm2 = (String name) -> 
        {
            System.out.println("Hello " + name);
        };
        
        gm2.greet("Ryan");
        
        // Another implementation of functional interface with a lambda
        messagePrinter mp = () -> 
        {
            System.out.println("This is a message.");
        };
        mp.printMessage();
    }

    @Override
    public void greet(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
