package com.safebear;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class GrouperApp
{
    public static void main( String[] args )
    {
        // Input skills
        System.out.println("Please Enter Student Skills (as a single String):");
        Scanner in = new Scanner(System.in);
        String skills = in.nextLine();

        // Print out the number of groups
        Grouper grouper = new Grouper(skills, new HelperFunctions());
        System.out.println("The number of possible groups is " + grouper.countGroups());

    }
}
