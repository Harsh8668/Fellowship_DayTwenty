package com.javaprojecr.daytwenty;

import java.util.regex.Pattern;

public class MoodAnalyser {

    public String analyseMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }

    public boolean validateFirstName(String firstName){
        boolean valid = Pattern.matches("[A-Z]{1}[a-zA-Z]+", firstName);
        return valid;
    }

    public boolean validateLastName(String lastName){
        boolean valid = Pattern.matches("[A-Z]{1}[a-zA-Z]+", lastName);
        return valid;
    }

    public boolean validateEmail(String email) {
        boolean valid = Pattern.matches("^[a-zA-Z]+[-\\+\\_\\.a-zA-Z0-9]+[@][a-zA-Z0-9]+([.]?[a-zA-Z\\,]{2,3}){2,3}",email);
        return valid;
    }

    public boolean validateMobileNumber(String mobile) {
        boolean valid = Pattern.matches("[+91|0|91]?[9876][0-9]{9}", mobile);
        return valid;
    }

    public boolean validatePassword(String password) {
        boolean valid = Pattern.matches("(.{8,}[A-Z0-9]?[+.$#@!&%*]?)", password);
        return valid;
    }
}