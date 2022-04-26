package com.company;

public class Task3_main{
    public class Task3Main{
        public static void main(String[] args){

            try{
                //Creating account object with parameters
                Account ac = new Account("Mr Elton",400,7566466);

                // Printing the user data
                System.out.println( ac.methodPrintInfo());


                //Calling the method transfer
                ac.methodTransferElton(700);

                throw new NotEnoughMoney("There is insufficient funds to make this payment!!!");

            }
            catch (NotEnoughMoney ex){
                System.out.println(ex.getMessage());
                ex.printStackTrace();
                System.out.println( ex);
            }
            finally{
                // System.out.println( "The Balance left is" + Account.current);


            }

        }
    }
}
