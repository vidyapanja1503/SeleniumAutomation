package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> testData = new ArrayList<>();
        testData.add("validUser");
        testData.add("validPass");

        try {
            System.out.println("Test starting...");
            System.out.println("Username: " + testData.get(0));
            System.out.println("Password: " + testData.get(1));

            // This will cause an error — index 5 doesn't exist!
            System.out.println("Getting index 5: " + testData.get(5));

            System.out.println("This line will never run");

        } catch (Exception e) {
            System.out.println("ERROR CAUGHT: " + e.getMessage());
            System.out.println("Test marked as FAILED safely");

        } finally {
            System.out.println("Browser closed — cleanup done!");
        }

        System.out.println("Program continues after exception!");
    }
}