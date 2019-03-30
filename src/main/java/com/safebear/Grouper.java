package com.safebear;

import java.util.ArrayList;
import java.util.List;

public class Grouper {

    private String skills;
    private final String allowedSkills = "abcde";
    private int groups = 0;

    private HelperFunctions helpers;

    // Getters and Setters

    /**
     * Getter for the skills instance variable
     * @return string of skills
     */
    public String getSkills() {
        return skills;
    }

    /**
     * Getter for the groups instance variable
     * @return (int) number of groups that can be made out of the skills string
     */
    public int getGroups() {
        return groups;
    }

    /**
     * Constructor that sets the skills variable and HelperFunctions object
     * @param _skills
     * @param _helpers
     */
    public Grouper(String _skills, HelperFunctions _helpers) {

        this.skills = _skills;
        this.helpers = _helpers;

    }

    // Function to count the number of student groups from a skills list
    public int countGroups() {

        if (skills.length() < 5) {
            return groups;
        }

        // Now lets turn our string into a list of one character strings
        List<String> skillsList = helpers.turnSkillsIntoArray(skills);

        // Remove any characters that arent' allowed
        helpers.removeValues(skillsList, allowedSkills);

        // Iterate through the skillsList and add to a 'group' array (checking for duplicates)
        // until the group array size = 5. Then group++ and delete everything in the group array.
        List<String> tempGroup = new ArrayList<>();

        for (String skill : skillsList) {

            if (!helpers.checkIfAValueIsInAnArray(tempGroup, skill)) {

                tempGroup.add(skill);

            }

            if (tempGroup.size() == 5) {

                groups++;
                tempGroup.clear();

            }

        }

        return groups;

    }
}



