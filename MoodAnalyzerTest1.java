package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest1 {
    /**
     * given a message ability to analyse and respond Happy or sad mood
     */
    @Test
    public void  given_a_message_RespondHappyOrSad() {
        MoodAnalyzer moodanalyzer = new MoodAnalyzer();
       String mood =  moodanalyzer.moodAnalyzer("Happy");
        Assert.assertEquals("SAD",mood);
    }
    /**
     * given i am in sad mood message should return Sad
     */
    @Test
    public void givenIaminSadMoodShouldReturnSad() {
        MoodAnalyzer moodanalyzer = new MoodAnalyzer();
       String mood =  moodanalyzer.moodAnalyzer("I am in Sad Mood");
       Assert.assertEquals("SAD",mood);
    }
    /**
     * given i am in any mood message should return happy
     */
    @Test
    public void givenIamInAnyMoodShouldReturnHappy() {
        MoodAnalyzer moodanalyzer1 = new MoodAnalyzer();
        String mood = moodanalyzer1.moodAnalyzer("I am in any Mood");
        Assert.assertEquals("Happy",mood);
        System.out.println(mood);

    }

    /**
     * Refractor the code to take the mood message in constructor
     */

    @Test
    public void givenIamInSadMoodConstructorShouldReturnTrue() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.moodAnalyzer("I am in sad mood");
        Assert.assertEquals("SAD",mood);
    }

    /**
     * Given i am in happy mood message in constructor should return SAD
     */
    @Test
    public void givenIamInHappyShouldReturnSAD() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
       String mood =  moodAnalyzer.analyseMood("I am in happy mood");
       Assert.assertEquals("SAD",mood);
        System.out.println(mood);
    }
    /**
     * Handle exception if user provides invalid mood like null.and use try catch block and return happy
     */

    @Test
    public void ifUserProvidesInvalidMood() {
        MoodAnalyzer moodAnalyzerException = new MoodAnalyzer();
       String mood =  moodAnalyzerException.analyzer(null);
       Assert.assertEquals("HAPPY",mood);

    }
    /**
     * inform user if entered invalid mood
     * in case null or empty throw custom exception
     */
    @Test
    public void informUserIfEnteredInvalidMood() throws MoodAnalyzer.MoodAnalysisException {
        MoodAnalyzer customException = new MoodAnalyzer();
        String mood = customException.Analyzing("Happy");
        Assert.assertEquals("SAD",mood);
        System.out.println("handled exception successfully");
    }
    /**
     * @method given empty mood should throw Mood analysis exception indicating Empty mood
     * Case handle empty mood scenario throw mood analysis exception and inform user of the empty mood
     */
    @Test
    public void givenEmptyMoodShouldThrowAnalysisExceptionEmptyMood() {
        MoodAnalyzer emptyMoodException = new MoodAnalyzer();
        String mood = emptyMoodException.emptyMood("Invalid Mood");
        Assert.assertSame("Invalid Mood",mood);
        System.out.println("Handled Exception");

    }
}
