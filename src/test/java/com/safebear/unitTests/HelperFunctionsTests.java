package com.safebear.unitTests;

import com.safebear.HelperFunctions;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelperFunctionsTests {

    @Test
    public void turnSkillsIntoArrayPositiveTest() {

        // Test data
        String data = "abcde";
        List<String> dataList = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e"));

        // Initialise HelperFunctions object
        HelperFunctions helpers = new HelperFunctions();

        // Get the result of the method
        List<String> result = helpers.turnSkillsIntoArray(data);

        // Check the result - expected/actual
        Assert.assertEquals(dataList, result);

    }

    @Test
    public void removeValuesPositiveTest(){

        // Test data
        String allowedValues = "abcde";
        // Original String
        List<String> dataList = new ArrayList<String>(Arrays.asList("x", "b", "y", "d", "z"));
        // Expected parsed string
        List<String> parsedList = new ArrayList<String>(Arrays.asList("b", "d"));

        // Initialise helper object
        HelperFunctions helpers = new HelperFunctions();

        // Check the result - expected/actual
        List<String> result = helpers.removeValues(dataList, allowedValues);
        Assert.assertEquals(parsedList, result);

    }

    @Test
    public void checkIfAValueIsInAnArrayPositiveTest(){

        // Test data
        String value = "d";
        List<String> dataList = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e"));

        // Initialise grouper with test data and the inner helpers class
        HelperFunctions helpers = new HelperFunctions();

        boolean result = helpers.checkIfAValueIsInAnArray(dataList, value);

        Assert.assertEquals(true, result);

    }


    /*
     * NOTE: Also need some boundary and negative tests for all of the above. Adding later.
     */

}
