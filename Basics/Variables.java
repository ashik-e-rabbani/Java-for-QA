package Basics;

public class Variables {
    static int sharedCounter = 0;  // Shared among all instances.

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY
    }

    public static void main(String[] args) {
        int age = 30;       // int variable
        String userName = "John";  // String variable
        int MAX_SALARY = 10000;
        final int dob = 31101996;
        int randomValue = (int) (Math.random() * 100);  // Initialized with a random number.
        Day today = Day.MONDAY;


        System.out.println("Name: " + userName);
        System.out.println("Age: " + age +"\nSalary: " + MAX_SALARY);
    }
}

