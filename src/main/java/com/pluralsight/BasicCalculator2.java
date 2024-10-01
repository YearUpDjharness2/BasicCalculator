package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = s.nextFloat();
        s.nextLine();


        System.out.print("Enter second number: ");
        float num2 = s.nextFloat();
        s.nextLine();

        System.out.println("Possible calculations: ");
        System.out.println("     (A)dd");
        System.out.println("     (S)ubtract");
        System.out.println("     (M)ultiply");
        System.out.println("     (D)ivide");
        System.out.print("Please select an option");

        String option = s.nextLine();


        if (option.equals("A") ) {
            //System.out.println("A is selected");
            doAdd(num1,num2);
        }
        if (option.equals("S") ) {
            //System.out.println("S is selected");
          doSubtract(num1,num2);
        }
        if (option.equals("M") ) {
            //System.out.println("M is selected");
           doMultiply(num1,num2);
        }
        if (option.equals("D") ) {
            //System.out.println("D is selected");
           doDivide(num1,num2);
        }


        }

    public static void doAdd(float a, float b){
        float result = a + b;
        System.out.println(a + " + " + b + " = " + result);
    }
    public static void doSubtract(float a, float b){
        float result = a - b;
        System.out.println(a + " - " + b + " = " + result);
    }
    public static void doMultiply(float a, float b){
        float result = a * b;
        System.out.println(a + " * " + b + " = " + result);
    }
    public static void doDivide(float a, float b){
        float result = a / b;
        System.out.println(a + " / " + b + " = " + result);
    }


}


