/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author bresn
 */
public class genericsExample {
    public static void main(String[] args)
    {
        // Declare vars
        List names;
        String name;
        
        // Example without generics
        names = new ArrayList();
        names.add("Ryan");
        name = (String) names.get(0); // here, we have to cast the list element to a string
        System.out.println("First name: " + name);
        //names.add(7);
        
        // Example with generics (we also don't declare vars beforehand)
        // this code is safer, as it ensures that only strings are added to the list (type checking)
        List<String> names2 = new ArrayList(); // here, we define the list as a list of strings FIRST
        names2.add("Ryan");
        String name2 = names2.get(0);
        System.out.println("First name: " + name2);
        //names2.add(7);
    }
}
