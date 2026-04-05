package org.example;

class TestCase {
    String testName;

    TestCase(String testName) {
        this.testName = testName;
    }

    void runTest() {
        System.out.println("Running generic test: " + testName);
    }
}

class UITest extends TestCase {
    String browserName;

    UITest(String testName, String browserName) {
        super(testName);
        this.browserName = browserName;
    }

    @Override
    void runTest() {
        System.out.println("UI Test: " + testName + " on " + browserName);
    }
}

class APITest extends TestCase {
    String endpoint;

    APITest(String testName, String endpoint) {
        super(testName);
        this.endpoint = endpoint;
    }

    @Override
    void runTest() {
        System.out.println("API Test: " + testName + " → hitting " + endpoint);
    }
}

class DBTest extends TestCase {
    String query;

    DBTest(String testName, String query) {
        super(testName);
        this.query = query;
    }

    @Override
    void runTest() {
        System.out.println("DB Test: " + testName + " → query: " + query);
    }
}

public class Main {
    public static void main(String[] args) {

        TestCase t1 = new UITest("Login Test", "Chrome");
        TestCase t2 = new APITest("Create User", "/api/users");
        TestCase t3 = new DBTest("Check Records", "SELECT * FROM users");

        t1.runTest();
        t2.runTest();
        t3.runTest();
    }
}