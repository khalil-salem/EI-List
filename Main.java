package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
String[] arr1=new String[] {"one","two","three"};
List<String> arr2= Arrays.asList(arr1);
for(int i=0;i<arr2.size();i++){
    System.out.print(arr2.get(i));
}
    }
}
