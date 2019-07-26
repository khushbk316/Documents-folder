package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@ComponentScan(basePackages = "com.stackroute")
public class Application
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Application.class);
        Application application=applicationContext.getBean(Application.class);
        application.start();
    }
    @Autowired
    private  Message message;
    public  void  start()
    {
        System.out.println("message is:" +message.getMessage());
    }
}

