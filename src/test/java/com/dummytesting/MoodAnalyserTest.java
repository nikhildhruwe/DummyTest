package com.dummytesting;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void testAnalyserMood() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is message");
        Assert.assertEquals( "SAD",mood);
    }

    @Test
    public void testHappyMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood=moodAnalyser.analyseMood("This  is Happy message");
        Assert.assertEquals("HAPPY",mood);

    }
}

