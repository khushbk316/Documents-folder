package com.stackroute.Pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class mainStudent {
    public static void main(String ar[])
    {
        ArrayList<Student> studentlist= new ArrayList<Student>();
        //1st student

        Student student1=new Student(1,"khushbu",23);
        studentlist.add(student1);

        //2nd student

        Student student2=new Student(2,"puja",23);
        studentlist.add(student2);

        //3rd student...
        Student student3=new Student(3,"rani",24);
        studentlist.add(student3);

        //4th student...
        Student student4=new Student(4,"khushbu",27);
        studentlist.add(student4);

        //5th student...
        Student student5=new Student(5,"deepa",25);
        studentlist.add(student5);
       // employees.forEach(System.out::println);
        //sorting arrays...
        System.out.println("Overriding toString and printing the ArrayList");
        System.out.println(studentlist.toString());
        System.out.println("Printing using Iterator");
        System.out.println("Before sorting.......");
        Iterator studIterator = studentlist.iterator();
        while (studIterator.hasNext()) {
            System.out.println(studIterator.next());
        }
        Collections.sort(studentlist,new studentSorter());
        Iterator studIterator1 = studentlist.iterator();
        System.out.println("\nAfter Sorting...");
        while (studIterator1.hasNext()) {
            System.out.println(studIterator1.next());
        }
    }
}





