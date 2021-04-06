package com.Practice;

public class Main {

    public static void main(String[] args) {

      Account bobsAccount = new Account();
      bobsAccount.setNumber("12345");
      bobsAccount.setBalance(0.00);
      bobsAccount.setCustomerName("Bob Brown");
      bobsAccount.setCustomerEmailAddress("myemail@bob.com");
      bobsAccount.setCustomerPhoneNumber("987654");


      bobsAccount.withdrawal(100.0);

      bobsAccount.deposit(50.0);
      bobsAccount.withdrawal(100.0);

      bobsAccount.deposit(5.0);
      bobsAccount.withdrawal(100.0);

      System.out.println("");
    }

}
