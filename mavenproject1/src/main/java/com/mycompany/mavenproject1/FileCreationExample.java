/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.File;
import java.io.IOException;
/**
 *
 * @author bresn
 */
public class FileCreationExample {
    
    public static void main(String[] args)
    {
        File myFile = new File("path");
        try {
            boolean fileCreated = myFile.createNewFile();
            System.out.println(fileCreated);
        } catch(IOException ioe) {
            
        }
    }
}
