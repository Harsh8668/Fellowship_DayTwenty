package com.javaprojecr.daytwenty;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Sad Message");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Happy Message");
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        boolean result = moodAnalyser.validateFirstName("Harsh");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        boolean result = moodAnalyser.validateFirstName("harsh");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        boolean result = moodAnalyser.validateLastName("Choudhary");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        boolean result = moodAnalyser.validateLastName("choudhary");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        boolean result = moodAnalyser.validateEmail("charsh123@gmail.com");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        boolean result = moodAnalyser.validateEmail(".charsh@123.com");
        Assert.assertEquals(false,result);
    }


    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        boolean result = moodAnalyser.validateMobileNumber("8923657412");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        boolean result = moodAnalyser.validateMobileNumber("89520665875");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        boolean result = moodAnalyser.validatePassword("harsh@123");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        boolean result = moodAnalyser.validateMobileNumber("*/hasd");
        Assert.assertEquals(false,result);
    }

}
