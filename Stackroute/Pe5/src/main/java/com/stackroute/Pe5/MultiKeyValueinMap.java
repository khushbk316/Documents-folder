package com.stackroute.Pe5;

import java.util.*;

public class MultiKeyValueinMap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value1.....");
        String str1 = scanner.nextLine();
        System.out.println("enter the value2.....");
        String str2 = scanner.nextLine();
        System.out.println("hashmap before any update....");

        Map<String, String> hashmap = new HashMap<>();
        hashmap.put("val1", str1);
        hashmap.put("val2", str2);
        //printing the value and key....
        System.out.println(str1);
        System.out.println(hashmap);
        //setting the value to nothing...for val1..

        hashmap.replace("val2",hashmap.get("val1"));
        hashmap.replace("val1","\"\"");
        System.out.println(hashmap);
    }
}