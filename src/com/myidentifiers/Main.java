/**
 *  Java program to demonstrate identifiers.
 */

package com.myidentifiers;

/**
 * Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating the instances with different names.
        int _var = 11;

        String strVar = "Hello";

        String $strVar = "Hello currency";

        // Printing variables values to console.
        System.out.println("_var is " + _var);
        System.out.println("strVar is " + strVar);
        System.out.println("$strVar is " + $strVar);

    }
}