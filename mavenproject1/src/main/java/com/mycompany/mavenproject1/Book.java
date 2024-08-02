/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.image.BufferedImage;

/**
 *
 * @author bresn
 */
public class Book {
    
    BufferedImage image;
    
    private String author;
    private String title;
    
    public Book(String author, String title)
    {
        this.author = author;
        this.title = title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    @Override
    public String toString()
    {
        return ("Author " + author + " Title: " + title);
    }
}
