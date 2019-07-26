package com.stackroute.Pe5;

import java.util.ArrayList;
import java.util.List;

public class updateElementinArraylist

{
    public  static void main(String ar[])
    {
        List<String> names=new ArrayList<String>();
        names.add("khushbu");
        names.add("lakshmi");
        names.add("gargi");
        names.add("rutuja");
        names.add("prerna");
        System.out.println("Arraylist elements before updating one element....."+names);
        names.set(0,"pranita");
        System.out.println("Arraylist elements after updating one element....."+names);
        names.clear();
        System.out.println(names);
    }
}
