package com.jnprogrammer;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("My string is equal to " + myString);
        myString = myString + ", and this is more power than you know MUAHAHAHAHHA!!";
        System.out.println("My string is equal to " + myString);
        myString = myString + "\u00a9 2015";
        System.out.println("My string is equal to " + myString);

        String numString = "250.323";
        numString = numString + "24";
        System.out.println("Tis the result of " + numString);

        String lastString = "20";
        int aNum = 17;
        lastString = lastString + aNum;
        System.out.println("Its still " + lastString);


    }
}
