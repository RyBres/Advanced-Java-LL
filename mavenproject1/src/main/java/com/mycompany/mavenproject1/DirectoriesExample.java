/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.File;
import java.io.FilenameFilter;
/**
 *
 * @author bresn
 */
public class DirectoriesExample {
    
    public static void main(String[] args)
    {
        FilenameFilter filter = (file, fileName) -> 
        {
            return fileName.contains(".");
        };
        
        String[] contents = new File(".").list();
    
        for(String file: contents)
        {
            System.out.println(file);
        }
        new File("myDirectory").mkdir();
    }
}
