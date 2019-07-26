package hackathon;

import java.util.ArrayList;

public class Arraylist_Demo {
    public static void main(String ar[])
    {
        ArrayList<Integer> arrayList=new ArrayList<>();
                arrayList.add(1);
                arrayList.add(2);
                arrayList.add(3);
                arrayList.add(4);
             System.out.println("arraylist after adding all elements is...."+arrayList);
             arrayList.remove(2);
        System.out.println("arraylist after removing 2nd elements is...."+arrayList);
        System.out.println("index of 3  is...."+arrayList.indexOf(3));
        System.out.println("is arraylist containing 4??..."+arrayList.contains(4));
    }
}
