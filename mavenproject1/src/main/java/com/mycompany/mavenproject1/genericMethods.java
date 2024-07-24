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
public class genericMethods
{
    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};
    
    // <T> is the type variable and a generic type. It will allow for checking of the vartype
    // For example, boolList will only take boolArray of the variables above
    // Since we use <T>, then the type after List<type> will have to match the
    // input variable defined above.
    public static<T> List<T> arrayToList(T[] array, List<T> list) // iterates over an array and adds its elements to a list
    {
        for (T object : array)
        {
            list.add(object);
        }
        return list;
    }
    
    public static void main(String[] args)
    {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        System.out.println(intList.get(0));
    }
}

