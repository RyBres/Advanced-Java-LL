/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author bresn
 */
public class PathClassExample {
    public static void main(String[] args)
    {
        Path path = Paths.get("HelloWorld.txt"); // path object
        try {
        Files.deleteIfExists(path);
        } catch (IOException ex) {
            
        }
    }
}
