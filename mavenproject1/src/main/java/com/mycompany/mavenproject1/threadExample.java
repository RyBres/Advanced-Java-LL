/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author bresn
 */
public class threadExample extends Thread {
    @Override
    public void run()
    {
        int i = 1;
        while(i <= 100)
        {
            System.out.println(i + " " + this.getName());
            i++;
        }
    }
}
