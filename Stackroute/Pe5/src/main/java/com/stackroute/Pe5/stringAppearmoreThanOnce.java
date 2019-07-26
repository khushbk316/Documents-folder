package com.stackroute.Pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class stringAppearmoreThanOnce {
    public  static void main(String ar[])
    {
        int i;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array of string.....");
        String arr[]=new String[6];
        for(i=0;i<6;i++)
        {
            arr[i]= scanner.nextLine();
        }

        Map<String,Boolean> countString=new HashMap<>();
        System.out.println(countString);
        for(String countword:arr)
        {
            if(countString.containsKey(countword))
            {
                countString.put(countword, true);
//                flag = true;
            }
            else
                countString.put(countword,false);
        }
        System.out.println(countString);

    }


}
