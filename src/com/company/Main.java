package com.company;

public class Main {

class Finally{
    public static void main(String[] args) {

        try {
            NullExc.generateNullException();

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.print("Caught NullPointerException");


        }

        for(int i = 0; i<3; i++){
            Task2.MyMethod(i);
            System.out.println( );

        }
    }
    }
}
