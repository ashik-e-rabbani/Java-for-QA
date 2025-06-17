package Basics;

public class ControlStructures {
    public static void main(String[] args) {
        // 1. Decision Making
        int number = 10;
        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        // Switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Switch statement for java 12+
        int day_s = 3;
        switch (day_s) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Invalid day");
        }

        // 2. Looping
        for (int i = 1; i <= 3; i++) {
            System.out.println("For loop iteration: " + i);
        }

        int i = 1;
        while (i <= 3) {
            System.out.println("While loop iteration: " + i);
            i++;
        }

        int j = 1;
        do {
            System.out.println("Do-while loop iteration: " + j);
            j++;
        } while (j <= 3);

        // 3. Branching
        for (int k = 1; k <= 5; k++) {
            if (k == 3) continue; // Skips iteration 3
            if (k == 5) break; // Stops loop at 5
            System.out.println("Branching example: " + k);
        }
    }
}

