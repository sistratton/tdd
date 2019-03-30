package com.safebear;

/**
 * Hello world!
 *
 */
public class GrouperApp
{
    public static void main( String[] args )
    {
        // Input skills
        String skills = System.console().readLine();

        // Print out the number of groups
        Grouper grouper = new Grouper(skills, new HelperFunctions());
        System.out.println("The number of groups allowed are " + grouper.countGroups());

    }
}
