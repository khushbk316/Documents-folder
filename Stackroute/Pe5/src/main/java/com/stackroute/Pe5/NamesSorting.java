package com.stackroute.Pe5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class NamesSorting {
    public static void main(String ar[])
    {
        Scanner scanner=new Scanner(System.in);
        HashSet<String> set=new HashSet<>();
        System.out.println("enter the string values....");
        set.add(scanner.nextLine());
        set.add(scanner.nextLine());
        set.add(scanner.nextLine());
        set.add(scanner.nextLine());
        set.add(scanner.nextLine());
        System.out.println("set values without sorting....");
        System.out.println(set);
        TreeSet<String> treeSet=new TreeSet<>(set);
        System.out.println("set values after the sorting....");
        System.out.println(treeSet);
        ArrayList<String> arrayList=new ArrayList<>(treeSet);
        System.out.println(arrayList);
    }


}
