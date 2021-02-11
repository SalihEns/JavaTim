package com.company;

public class Main {

    public static void main(String[] args) {
        checkNumber( 5);
        checkNumber(0);
        checkNumber(-5);
    }
    public static void checkNumber( int number) {

        if (number > 0) {
            System.out.println("pozitif");
        }
        else if (number<0){
            System.out.println("negatif");
        }
        else if (number==0) {
            System.out.println("sifir");
        }
        else{
            System.out.println("Error!");
        }



    }
}
