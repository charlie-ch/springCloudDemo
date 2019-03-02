package com.cheng.servicehi;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.forEach(
                (s)-> {
                    System.out.println(s);
                    System.out.println("===");

                }
        );
    }
}
