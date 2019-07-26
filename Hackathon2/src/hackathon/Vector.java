package hackathon;
//Vector implements a dynamic array that means it can grow or shrink as required. Like an array, it contains components that can be accessed using an integer index
// They are very similar to ArrayList but Vector is synchronised and have some legacy method which collection framework does not contain.
// It extends AbstractList and implements List interfaces.
import java.util.*;

    class Vector_ {
        public static void main(String[] arg)
        {

            // create default vector
            Vector v = new Vector();

            v.add(0, 1);
            v.add(1, 2);
            v.add(2, "stack");
            v.add(3, "stackroute");
            v.add(4, 3);

            System.out.println("Vector is " + v);
            System.out.println("value at index "+1+ "is" +v.get(1));
            System.out.println(" capacity of vector is.. "+v.capacity());
            System.out.println("index of stackroute is..."+v.indexOf("stackroute"));
            System.out.println("To check vector is empty or not..."+v.isEmpty());
            System.out.println("clearing the vector....");
            v.clear();
            System.out.println(v);
        }
    }
