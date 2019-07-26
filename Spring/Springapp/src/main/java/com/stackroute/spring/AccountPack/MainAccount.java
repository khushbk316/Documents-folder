package com.stackroute.spring.AccountPack;

import com.stackroute.spring.AccountPack.Account;
import com.stackroute.spring.AccountPack.AccountVariables;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAccount {
    public static void main(String ar[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Account acc123 = (Account) context.getBean("account");
        acc123.message();
        AccountVariables accvar = (AccountVariables) context.getBean("acc");
        accvar.Details();


    }
}