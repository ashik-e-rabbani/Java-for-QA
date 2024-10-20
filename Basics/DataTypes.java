package Basics;

//Primitive Data Types:
//byte: 8-bit integer
//short: 16-bit integer
//int: 32-bit integer (most common for integers)
//long: 64-bit integer
//float: 32-bit floating point
//double: 64-bit floating point (more precise)
//char: 16-bit Unicode character
//boolean: true/false values

// Max value calculation -> 2^(N bit -1)

public class DataTypes {
    public static void main(String[] args) {
        byte signedByte = 127;  // Max value
        byte negativeByte = -128; // Min value

        short signedShort = 32767; // Max value
        short negativeShort = -32768; // Min value

        int age = 25;               // Integer data type
        double price = 99.99;        // Double data type
        char initial = 'A';         // Char data type
        boolean isTestPassed = true; // Boolean data type

        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Initial: " + initial);
        System.out.println("Test Passed: " + isTestPassed);
    }
}
