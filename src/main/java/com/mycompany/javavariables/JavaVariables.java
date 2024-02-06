/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javavariables;

/**
 *
 * @author Ribaration
 */
public class JavaVariables {

    public static void main(String[] args) {
      /* 
        Variables are containers for storing data values.
        String - stores text, such as "Hello", they are surrounded by double quotes
        int - stores integers (whole numbers), without decimals, such as 123 or -123
        float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        boolean - stores values with two states: true or false

      */
        String name = "Lerato";
        //the equal sign is used to assign values to the variable
        int Mynum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        String myText = "Heloooo World";
        System.out.println(name);
        System.out.println(Mynum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myText);
        
        /*the final keyword  will declares the variable as "final" or "constant",
        which means unchangeable and read-only):*/
        final int myNum = 15;
        System.out.println(myNum);

        
        
        
        System.out.println(name);
    }
}
