package org.example;

import java.util.Scanner;

/*
 *   UCF COP 3330 Fall 2021 Assignment 14 Solution
 *   Copyright 2021 Donovan Reynolds
 */
public class App 
{
    public static void main( String[] args )
    {
        final double conversion = .055;
        String orderText = inputOutput("What is the order amount?");
        String stateText = inputOutput("What is the state?");

        double order = stringToDouble(orderText);
        String output = "";
        double tax = 0.0;

        if (stateText.toUpperCase().equals("WI"))
        {
            tax = Math.ceil(order * conversion * 100)/100;

            output = String.format("The subtotal is $%.2f\n" , order);
            output = output + String.format("The tax is $%.2f\n" , tax);

        }
        double total = order + tax;
        output = output + String.format("The total is $%.2f", total);

        System.out.println(output);
    }
    public static String inputOutput(String textToSay)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();
    }

    public static int stringToInt(String text)
    {
        return Integer.parseInt(text);
    }

    public static double stringToDouble (String text)
    {
        return Double.parseDouble(text);
    }
}
