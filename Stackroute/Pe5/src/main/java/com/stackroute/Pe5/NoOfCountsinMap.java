package com.stackroute.Pe5;

import java.util.*;

public class NoOfCountsinMap {
    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the text...");
        String input = scanner.nextLine();
        List<String> StringList;
        StringList = Arrays.asList(input.split("[\\W]+"));

        Map<String, Integer> StringCount = new HashMap<>();

        for (String countword : StringList) {
            if (StringCount.containsKey(countword))
                StringCount.replace("countword", StringCount.get(countword) + 1);
            else
                StringCount.put(countword, 1);
        }
        System.out.println(StringCount);
    }
}
