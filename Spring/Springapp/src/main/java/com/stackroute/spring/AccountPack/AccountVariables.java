package com.stackroute.spring.AccountPack;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

public class AccountVariables {
    private int accNumber;
    private String accHolderName;

    public AccountVariables(int accNumber, String accHolderName) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
    }

    public AccountVariables() {
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }
    public void Details()
    {
        System.out.println("details are....."+getAccHolderName()+getAccNumber());
    }



}
