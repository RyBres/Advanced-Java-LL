/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.HashMap;
/**
 *
 * @author bresn
 */
public class hashmapExample 
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 12333);
        phonebook.put("Brenda", 22233);
        phonebook.put("Brenda", 22222); // this overwrites the first Brenda entry
        phonebook.put(null, 000);
        if(phonebook.containsKey("Brenda"))
        {
            phonebook.remove("Brenda"); // this removes Brenda
        }
        phonebook.clear(); // this totally erases all data
        System.out.println(phonebook);
    }
}
