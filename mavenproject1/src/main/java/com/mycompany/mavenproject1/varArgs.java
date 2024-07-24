/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author bresn
 */
public class varArgs // varargs are variable length arguments which can be used in a method
{
    
    public static void main(String[] args)
    {
        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";
        String[] shopping = {"Bread", "Milk", "Eggs", "Bananas"};
        printShoppingList(item1, item2, item3);
        printShoppingList(shopping); // we don't even need to pass an array,
        // as it will create one for me (with varargs). See below
        printShoppingList("Bread", "Milk", "Eggs", "Bananas");
    }
    
    // 1 Let's define some methods to deal with this.
    
    /*
    private static void printShoppingList(String string1, String string2)
    {
        System.out.println("SHOPPING LIST");
        System.out.println("1. " + string1);
        System.out.println("2. " + string2);
    }
    
    private static void printShoppingList(String string1, String string2, String string3)
    {
        System.out.println("SHOPPING LIST");
        System.out.println("1. " + string1);
        System.out.println("2. " + string2);
        System.out.println("3. " + string1);
        System.out.println();
    }
    */
    
    
    // 2 If we want to account for an array argument, the most basic
    // and least efficient way would be to override repeatedly, like above.
    // Instead, we can define a different method like below that will print
    // every element of an array
    
    /*
    private static void printShoppingList(String[] items)
    {
        System.out.println("SHOPPING LIST");
        for (int i = 0; i < items.length; i++)
        {
            System.out.println(i + 1 + ": " + items[i]);
        }
        System.out.println();
    }
    */
    
    // 3 However, the best method would be use a method that uses varargs.
    // This achieved by simply replacing String[] with String... in args.
    private static void printShoppingList(String... items)
    {
        System.out.println("SHOPPING LIST");
        for (int i = 0; i < items.length; i++)
        {
            System.out.println(i + 1 + ": " + items[i]);
        }
        System.out.println();
    }
}
