package com.stackroute.spring.Spring_Inheritance;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawTriangleMain {

        public static void main(String ar[])
        {
            AbstractApplicationContext context=new ClassPathXmlApplicationContext("Inheritance.xml");
            context.registerShutdownHook();
            TriangleClass triangle=(TriangleClass) context.getBean("triangle");
            triangle.draw();
            Point point=(Point)context.getBean("PointChild");
            point.prinCordinates();
        }//we add abstractapplication context and call registerShutdown to initialization msg....
    }



