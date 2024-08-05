/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author bresn
 */
public class Person {
    private String name;
    private int age;
    private long phoneNumber;
    
    public Person(String name, int age, long phoneNumber)
    {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        
        System.out.println("Person created. Name: " + name + ", Age: "
        + age + ", Phone Number: " + phoneNumber);
    }
}
