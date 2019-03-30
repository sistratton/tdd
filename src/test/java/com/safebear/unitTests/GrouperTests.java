package com.safebear.unitTests;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.safebear.Grouper;
import com.safebear.HelperFunctions;
import com.sun.tools.javac.main.OptionHelper;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Unit test for simple GrouperApp.
 */
public class GrouperTests
{

    /**
     * Test the Grouper class. I.e. the constructor and instance variables
     */
    @Test
    public void GrouperPositiveTest(){

        // Test data
        String data = "abcde";

        // Initialise object with test data
        Grouper grouper = new Grouper(data, new HelperFunctions());

        // Test getters and setters
        Assert.assertEquals(0, grouper.getGroups());
        Assert.assertEquals(data, grouper.getSkills());

    }

    @Test
    public void countGroupsPostiveTest()
    {
        // Test data
        String skills = "abcdeabcde";
        String allowedValues = "abcde";
        List<String> dataList = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e","a", "b", "c", "d", "e" ));

        // Temp Group slowly gets built
        List<String> emptygroup = new ArrayList<String>();
        List<String> groupa = new ArrayList<String>(Arrays.asList("a"));
        List<String> groupb = new ArrayList<String>(Arrays.asList("a", "b"));
        List<String> groupc = new ArrayList<String>(Arrays.asList("a", "b", "c"));
        List<String> groupd = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));


        // Mock out our Helpers functions class
        HelperFunctions helpers = mock(HelperFunctions.class);

        // Mock out these methods
        when(helpers.removeValues(dataList, allowedValues)).thenReturn(dataList);
        when(helpers.turnSkillsIntoArray(skills)).thenReturn(dataList);

        // Need 5 examples returned here
        when(helpers.checkIfAValueIsInAnArray(emptygroup, "a")).thenReturn(false);
        when(helpers.checkIfAValueIsInAnArray(groupa, "b")).thenReturn(false);
        when(helpers.checkIfAValueIsInAnArray(groupb, "c")).thenReturn(false);
        when(helpers.checkIfAValueIsInAnArray(groupc, "d")).thenReturn(false);
        when(helpers.checkIfAValueIsInAnArray(groupd, "e")).thenReturn(false);

        // Initialise Grouper object and pass through our Mock
        Grouper grouper = new Grouper(skills, helpers);

        Assert.assertEquals(2, grouper.countGroups() );

    }

    /*
     * NOTE: Also need some boundary and negative tests for all of the above. Adding later.
     */




}
