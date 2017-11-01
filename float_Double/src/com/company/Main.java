package com.company;

public class Main {

    public static void main(String[] args) {
	   // width of int = 32(4 bytes).
       int myInt = 5;
       // width of float = 32 (4 bytes)
       float myFloat = 5f / 3f;
       // width of double = 64 (8 bytes);
       double myDouble = 5d/3d;

       System.out.println("MyInt Value = " + myInt);
       System.out.println("myFloat Value = " + myFloat);
       System.out.println("MyDouble Value = " + myDouble);

        double poundsInKilos = .45359237;
        int numPonds = 200;
        double convertedKilo = numPonds * poundsInKilos;
        System.out.println("Answer: " + convertedKilo);

    }
}
