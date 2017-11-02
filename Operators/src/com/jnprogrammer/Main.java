package com.jnprogrammer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = "+result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;

        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;

        System.out.println("Result is now "+ result);
        result++;
        System.out.println("Result is now "+ result);
        result+=20;
        System.out.println("Result is now "+ result);
        result/=5;
        System.out.println("Result is now "+ result);
        result*=2;
        System.out.println("Result is now "+ result);
        result%=9;
        System.out.println("Result is now "+ result);



        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It's is not an alien PHEW!!");
            isAlien = true;
        }
        if(isAlien == true){
            System.out.println("ITs AN ALI.E... . ...");
        }

        int score = 100;
        if(score >= 100)
            System.out.println("You got the high score!");

        int newScore = 32;
        if(score > newScore && score <= 100)
            System.out.println("Great this test passed!!");

    }
}
