package com.safebear;

import java.util.ArrayList;
import java.util.List;

public class Grouper {

    private String skills;
    private final String allowedSkills = "abcde";
    private int groups = 0;

    // Getters and Setters
    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getGroups() {
        return groups;
    }

    public void setGroups(int groups) {
        this.groups = groups;
    }


    // Constructor that sets the skills variable
    public Grouper(String _skills){

        this.skills = _skills;

    }

    // Function to count the number of student groups from a skills list
    public int countGroups() {

        if (skills.length() < 5 ){
            return groups;
        }

        // Now lets turn our string into a list of one character strings
        List<String> skillsList = turnSkillsIntoArray();

        // Remove any characters that arent' allowed
        removeValues(skillsList);

        // Iterate through the skillsList and add to a 'group' array (checking for duplicates)
        // until the group array size = 5. Then group++ and delete everything in the group array.
        List<String> tempGroup = new ArrayList<>();

        for (String skill : skillsList ) {

            if (!checkIfAValueIsInAnArray(tempGroup, skill)){

                tempGroup.add(skill);

            }

            if (tempGroup.size() == 5){

                groups++;
                tempGroup.clear();

            }

        }

        return groups;

    }

    // Turn Skills List into a List of one character strings (can't creat a 'List' of chars)
    public List<String> turnSkillsIntoArray(){

        List<String> skillsList = new ArrayList<>();

        for (int i = 0; i < skills.length(); i++){

            skillsList.add(skills.substring(i, i+1));
        }

        return skillsList;

    }

    // Remove any values in an array that aren't in a default array
    public List<String> removeValues(List<String> skillsList){

        for (int i = 0; i < skillsList.size(); i++){
            if (!allowedSkills.contains(skillsList.get(i))){

                skillsList.remove(i);
            }
        }

        return  skillsList;

    }

    // Check if a value is in an array
    public boolean checkIfAValueIsInAnArray(List<String> stringArray, String checkString){

        boolean inArray = false;

        for (String string : stringArray){
            if (string == checkString){
                inArray = true;
            }
        }

        return  inArray;

    }


}
