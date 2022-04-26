package com.company;

public class CallMe {
    public static void main(String[] args){
        try{
           CallMe g = new CallMe();
            System.out.println( g.exceptionMethod("Man","Woman"));
            throw new NewException1("Error");

        }
        catch(NewException1 ex ){
            ex.getMessage();
        }


    }

    private boolean exceptionMethod(String man, String woman){
        return false;
    }
}


