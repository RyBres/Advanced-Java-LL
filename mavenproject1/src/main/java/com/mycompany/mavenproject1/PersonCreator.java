/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
/**
 *
 * @author bresn
 */
public class PersonCreator {
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scanner.next();
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();
        System.out.print("Enter a phone number: ");
        Long phoneNumber = scanner.nextLong();
        Person person = new Person(name, age, phoneNumber);
    }

    
}
