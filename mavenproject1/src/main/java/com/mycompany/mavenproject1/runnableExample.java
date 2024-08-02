/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author bresn
 */
public class runnableExample implements Runnable 
{
    @Override
    public void run()
    {
        int i = 0;
        while(i <= 100)
        {
            System.out.println(i + " " + Thread.currentThread().getName());
            i++;
        }
    }
}
