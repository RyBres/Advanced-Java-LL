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
public class substitutionFailure {
    public static void main(String[] args)
    {
        Building building = new Building();
        Office office = new Office();
        build(building);
        build(office);
        
        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Office());
        printBuildings(buildings);
        
        List<Office> offices = new ArrayList();
        offices.add(new Office());
        offices.add(new Office());
        //printBuildings(offices); // displays that although office is a subtype of 
        // building, which means you can for ex. pass an office type to a 
        // building method, that it's not totally universal. HEre we see that
        // a list of offices is not considered a subtype of a list of buildings
    }
    
    static void build(Building building)
    {
        System.out.println("Constructing a new " + building.toString());
    }
    
    static void printBuildings(List<Building> buildings)
    {
        for (int i = 0; i < buildings.size(); i++)
        {
            System.out.println(i + 1 + ": " + buildings.get(i).toString());
        }
    }
}
