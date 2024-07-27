/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.LinkedList;

/**
 *
 * @author bresn
 */
public class Store {
    
    public static void main(String[] args)
    {
        LinkedList<Customer> queue = new LinkedList();
        queue.add(new Customer("Sally"));
        queue.add(new Customer("Ben"));
        queue.add(new Customer("Emma"));
        queue.add(new Customer("Fred"));
        System.out.println(queue);  
        serveCustomer(queue);
        System.out.println(queue);
    }
    
    
    static void serveCustomer(LinkedList<Customer> queue)
    {
        Customer c = queue.poll();
        c.serve();
    }
}
