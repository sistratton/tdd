package com.safebear.domainTests;

import com.safebear.Grouper;
import com.safebear.HelperFunctions;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Unit test for simple GrouperApp.
 */
public class GrouperDomainTests
{

    @Test
    public void countGroupsPostiveTest()
    {
        // Test data
        String skills = "abcdeabcde";

        // Initialise Grouper and HelperFunctions objects
        HelperFunctions helpers = new HelperFunctions();
        Grouper grouper = new Grouper(skills, helpers);

        Assert.assertEquals(2, grouper.countGroups() );

    }

    /*
     * NOTE: Also need some boundary and negative tests for all of the above. Adding later.
     */




}
