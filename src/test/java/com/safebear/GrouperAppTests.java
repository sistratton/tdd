package com.safebear;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple GrouperApp.
 */
public class GrouperAppTests
{

    /**
     * Test the Grouper class. I.e. the constructor and instance variables
     * DONE
     */
    @Test
    public void GrouperTest(){

        // Test data
        String data = "abcde";

        // Initialise grouper with test data
        Grouper grouper = new Grouper(data);

        // Test getters and setters
        Assert.assertEquals(grouper.getGroups(), 0);
        Assert.assertEquals(grouper.getSkills(), data);

    }

    /**
     *
     * Test the grouper.turnSkillsIntoArray() method.
     * This method should probably be private and tested through reflection.
     */
    @Test
    public void turnSkillsIntoArrayTest() {

        // Test data
        String data = "abcde";
        List<String> dataList = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e"));

        // Initialise grouper with test data
        Grouper grouper = new Grouper(data);

        // Get the result of the method
        List<String> result = grouper.turnSkillsIntoArray();

        // Check the result
        Assert.assertEquals(result, dataList);

    }


    // removeValuesTest
    @Test
    public void removeValuesTest(){

    }


    // checkIfAValueIsInAnArrayTest
    @Test
    public void checkIfAValueIsInAnArrayTest(){

    }


    /**
     */
    @Test
    public void countGroupsPostiveTest()
    {
        // Needs some mocks in here

        // Pass data through to class
        Grouper grouper = new Grouper("abcdeabcde");

        Assert.assertEquals(2, grouper.countGroups() );

    }

    // Boundary and negative tests



}
