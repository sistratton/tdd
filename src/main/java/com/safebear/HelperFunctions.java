package com.safebear;

import java.util.ArrayList;
import java.util.List;

public class HelperFunctions {

    /**
     * Turn Skills List into a List of one character strings (can't creat a 'List' of chars)
     * @param skills student's skills
     * @return List of Strings (single characters) of the students skills
     */
    public List<String> turnSkillsIntoArray(String skills) {

        List<String> skillsList = new ArrayList<>();

        for (int i = 0; i < skills.length(); i++) {

            skillsList.add(skills.substring(i, i + 1));
        }

        return skillsList;

    }

    /**
     * Remove any values in an array that aren't in a default array
     * @param skillsList List of skills (Single character strings)
     * @param allowedSkills List of allowed skills as a string
     * @return a parsed list of skills (Single character strings)
     */
    public List<String> removeValues(List<String> skillsList, String allowedSkills) {

        for (int i = 0; i < skillsList.size(); i++) {
            if (!allowedSkills.contains(skillsList.get(i))) {

                skillsList.remove(i);
            }
        }

        return skillsList;

    }

    /**
     * Check if a value is in an array
     * @param stringArray
     * @param checkString
     * @return
     */
    public boolean checkIfAValueIsInAnArray(List<String> stringArray, String checkString) {

        boolean inArray = false;

        for (String string : stringArray) {
            if (string == checkString) {
                inArray = true;
            }
        }

        return inArray;

    }

}
