/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author bresn
 */
public class House extends Building
{
    public int numberOfRooms = 10;
    
    @Override
    public String toString()
    {
        return ("house");
    }
    
    public int getNumberOfRooms()
    {
        return numberOfRooms;
    }
    
    public void setNumberOfRooms(int numberOfRooms)
    {
        this.numberOfRooms = numberOfRooms;
    }
}
