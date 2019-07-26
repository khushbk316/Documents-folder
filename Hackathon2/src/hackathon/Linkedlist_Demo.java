package hackathon;

//Linked List are linear data structures where the elements are not stored in contiguous locations
// and every element is a separate object with a data part and address part.
//The elements are linked using pointers and addresses. Each element is known as a node

import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist_Demo {
    public static void main(String ar[]) {
        LinkedList<String> list = new LinkedList<>();
        list.add("khushbu");
        list.add("prity");
        list.add("kumari");
        list.add("puja");
        list.add("punam");
        System.out.println("list is....." + list);
        System.out.println("removing the 2nd elemenmt...." + list.remove(2));
        System.out.println("checking list contains prity or nor...." + list.contains("prity"));
        System.out.println("size of the list is....." + list.size());
        ListIterator listIterator = list.listIterator();
        System.out.println("printing the list values using iterator....");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
