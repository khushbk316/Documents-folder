package com.stackroute.spring.draw_triangle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PatternDraw {
    public static void main(String ar[])
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle=(Triangle)context.getBean("triangle");
        triangle.draw();
        Point point=(Point)context.getBean("Point");
        point.prinCordinates();
    }
}
