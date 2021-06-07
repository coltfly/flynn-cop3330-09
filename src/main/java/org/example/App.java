package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colton Flynn
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner Obj = new Scanner(System.in);

        final int conversion = 350;

        System.out.print( "What is the length of the room in feet? ");
        int legnth = Integer.parseInt(Obj.nextLine());

        System.out.print( "What is the width of the room in feet? ");
        int width = Integer.parseInt(Obj.nextLine());

        double area = legnth * width;
        int gallons = (int)Math.ceil(area/conversion);

        System.out.println("You will need to purchase "+gallons+" gallons of paint to cover "+(int)area+" square feet.");
    }
}