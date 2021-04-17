package com.bridgelabz;

import jdk.jshell.spi.ExecutionControl;

public class MoodAnalyzer {
    public String moodAnalyzer(String message) {
        if(message.contains("I am in any Mood")) {
            return "Happy";
        }
        else{
            return "SAD";
        }
    }

    public String MoodAnalyzer(String message) {
        if(message.contains("I am in sad mood")) {
            return "SAD";
        }
        else {
            return "Happy";
        }
    }
    public String analyseMood(String message) {
        if(message.contains("I am in happy mood")) {
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }

    public String analyzer(String message)  {
            try {
                if (message.contains("HAPPY")) {
                    return "HAPPY";
                } else {
                    return "SAD";
                }
            } catch (NullPointerException e) {
                System.out.println("Happy");
            }
            return "HAPPY";
        }

        public String Analyzing(String message) throws MoodAnalysisException {
            if (message.contains("HAPPY")) {
                throw new MoodAnalysisException("message");
            } else {
                return "SAD";
            }
        }

    public class MoodAnalysisException extends Exception {
        public MoodAnalysisException(String message) {
            super(message);
        }
    }
    public  String emptyMood(String message) {
        try {
            if (message.contains("Empty Mood")) {
                throw new MoodAnalysisException(message);
            }
        }catch (MoodAnalysisException e){
            System.out.println("Invalid Mood");
        }
        return "Invalid Mood";
    }
}

