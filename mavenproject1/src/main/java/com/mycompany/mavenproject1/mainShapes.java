/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author bresn
 */
public class mainShapes {
    public static void main(String[] args)
    {
        // Instead of a lambda, which is commented out, we will use a method
        // reference.
        
        Square s = new Square(4);
        /*
        Shapes shapes = (Square square) -> {
            return square.calculateArea();
        };
        */
        Shapes shapes = Square::calculateArea; // much shorter and simpler than
        // a lambda.
        
        System.out.println("Area: " + shapes.getArea(s));
        
        
    }
}
