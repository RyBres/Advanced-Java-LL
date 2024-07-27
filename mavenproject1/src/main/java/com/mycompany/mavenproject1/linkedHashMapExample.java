/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.LinkedHashMap;
import java.util.Map;
/**
 *
 * @author bresn
 */
public class linkedHashMapExample 
{
    public static void main(String[] args)
    {
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap();
        // The below LHM specifies that the HashMap has 4 entries, then will increase
        // in size when 75% full. A third argument may be used (boolean), which
        // specifies the ordering mode. False sets items in the way they were entered.
        // If true, then it will set them in order of their access (so modified longest
        // ago to most recent).
        //LinkedHashMap<String, Integer> phonebook = new LinkedHashMap(4, 0.75f, false);
        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 12333);
        phonebook.put("Brenda", 22233);
        System.out.println("Kevin's number: " + phonebook.get("Kevin"));

        System.out.println("\nList of contacts in phonebook: ");

        for(Map.Entry<String, Integer> entry: phonebook.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
