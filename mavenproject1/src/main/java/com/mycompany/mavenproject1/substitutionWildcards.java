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
public class substitutionWildcards 
{
    public static void main(String[] args)
    {
        // List of buildings
        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Building());
        printBuildings(buildings);
        
        // List of offices
        List<Office> offices = new ArrayList();
        offices.add(new Office());
        offices.add(new Office());
        //printBuildings(offices);
        
        // List of houses
        List<House> houses = new ArrayList();
        houses.add(new House());
        houses.add(new House());
        //printBuildings(houses);
        
        //addHouseToList(houses);
        //addHouseToList(buildings);
    }   
    
    // the ? extends is the wildcard element of the type definition.
    // This will allow us to finally input list subtypes of buildings
    // (i.e., houses and offices). It is quite self explanatory
    static void printBuildings(List<? extends Building> buildings)
    {
        for(int i = 0; i < buildings.size(); i++)
        {
            System.out.println(buildings.get(i).toString() + " " + (i + 1));
        }
        System.out.println();
    }
    
    // We can also use wildcards to pass a supertype when only a subtype is specified.
    // For example, if we want to pass buildings to a method that currently accepts
    // only a list of houses.
    static void addHouseToList(List<? super House> buildings)
    {
        buildings.add(new House());
        System.out.println();
    }
}
