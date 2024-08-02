/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
/**
 *
 * @author bresn
 */
public class Library {
    public static void main(String[] args)
    {
        ArrayList<Book> books = populateLibrary();
        
        // Below, we implement a stream. It is faster and simpler than a for loop.
        books.stream().filter(book -> {
            return book.getAuthor().startsWith("A");
        }).filter(book -> {
            return book.getTitle().startsWith("M");
        }).forEach(System.out::println);
        
        // We can also implement these streams in parallel on different cores 
        // of the machine.
        books.parallelStream().filter(book -> {
            return book.getAuthor().startsWith("J");
        }).forEach(System.out::println);
    }
    
    static ArrayList<Book> populateLibrary()
    {
        ArrayList<Book> books = new ArrayList();
        books.add(new Book("Alice Walker", "The Color Purple"));
        books.add(new Book("Alice Walker", "Meridian"));
        books.add(new Book("Toni Morrison", "Beloved"));
        books.add(new Book("Julius", "Anothah One"));
        books.add(new Book("Early Church Fathers", "Bible"));
        return books;
    }
}
