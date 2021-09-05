/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

//import statement for scanner
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        //scanner used to read data inputted
        Scanner scanner = new Scanner(System.in);

        //print statement asking for name to be inputted
        System.out.println("What is your name? ");
        //string will be inputted and stored as "message"
        String message = scanner.nextLine();

        //print input and response back
        System.out.format("Hello, %s, nice to meet you!", message);

    }
}