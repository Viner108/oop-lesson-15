package com.dmdev.iterator;

import com.dmdev.lesson18.List1;

import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List1<String> list=new List1<>(10);
        list.add("string1");
        list.add("string2");
        list.add("string3");
        list.add("string4");
//        for (String value:list){
//            System.out.println(value);
//        }
        list.iterator().forEachRemaining(System.out::println);
    }
}
