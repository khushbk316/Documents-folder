package com.stackroute.spring.AccountPack;

public class Account  {



    private AccountVariables acc;


    public Account() {
    }

    public Account(AccountVariables acc) {
        this.acc = acc;
    }


    public AccountVariables getAcc() {
        return acc;
    }

    public void setAcc(AccountVariables acc) {
        this.acc = acc;
    }


public void message()
{
    System.out.println( "congrats "+acc.getAccHolderName());

}


}
