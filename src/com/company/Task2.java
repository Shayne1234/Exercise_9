package com.company;



public class Task2 {
    public static void MyMethod(int whatValue) {
        int num;
        int nums[] = new int[2];

        System.out.println("What Values it gets:" + whatValue);

        try {
            switch (whatValue) {

                case 0:
                    num = 15 / whatValue;
                    break;
                case 1:
                    nums[3] = 3;
                    break;
                case 2:
                    return;

            }
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
            return;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error number can't be found");

        }
        finally {
            System.out.println("Well done");
        }

    }}