package com.company;

public class NullExc {

    static void generateNullException(){
        int numbers[] = new int[7];

        System.out.println("Before exception");

        numbers[17] = 10;
        System.out.println("Out of Range");


    }
}
