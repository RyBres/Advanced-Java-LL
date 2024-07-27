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
public class Customer {
    
    private boolean hasBeenServed;
    private String name;
    
    public Customer(String name)
    {
        hasBeenServed = false;
        this.name = name;
    }
    
    public void serve()
    {
        hasBeenServed = true;
        System.out.println(name + " has been served");
    }
    
    @Override
    public String toString()
    {
        return name;
    }
}
