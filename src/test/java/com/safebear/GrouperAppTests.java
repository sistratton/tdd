package com.safebear;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple GrouperApp.
 */
public class GrouperAppTests
{

    /**
     * Test the Grouper class. I.e. the constructor and instance variables
     */
    @Test
    public void GrouperTest(){

        // Test data
        String data = "abcde";

        // Test getters and setters
        Grouper grouper = new Grouper(data);

        Assert.assertEquals(grouper.getGroups(), 0);
        Assert.assertEquals(grouper.getSkills(), data);

    }

    // turnSkillsIntoArrayTest
    @Test
    public void turnSkillsIntoArrayTest(){


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
