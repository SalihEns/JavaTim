package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 ;

        result++ ;
        System.out.println(result);

        result-- ;
        System.out.println(result);

        result+=2 ;
        System.out.println(result);

        result*=10 ;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("I am scared of alliens");
        }

        int topscore = 80 ;

        if (topscore<100) {
            System.out.println("you got the high score!");
        }

        int secondtopscore = 60;
        if((topscore  >  secondtopscore) && (topscore < 100)) { // left operand and right operand both have to be true in order to be executed by if statement.
            System.out.println("Greater than second top score and less than 100");

         if ((topscore >90) || (secondtopscore<= 90))  {

             System.out.println("Either one of them is true. lets go");
         }
         int newValue = 50 ; //     THE ASSIGNMENT OPERATOR= AND EQUALS TO OPERATOR==
         if (newValue==50)   // IF THEN STATEMENTS HAVE EQUALS TO OPERATOR. == NOT SINGLE =
             System.out.println("This is TRUE");

         boolean isCar = false ;
         if (isCar==false) {
             System.out.println("This is not supposed to happen");
         }
         isCar = true ;
         boolean wasCar = isCar ? true : false ;
         if(wasCar) {
             System.out.println("wasCar is true");
         }

         








        }

    }
}
