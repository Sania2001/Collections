package com.abstr;

import java.util.ArrayList;

public class Array {

    public static void main(String[] args) {
        ArrayList<String> name= new ArrayList<>();

        name.add("Sania");
        name.add("Sanakalp");
        name.add("Sushant");
        System.out.println(name);
        name.set(2, "Rahul");
        System.out.println(name);

        name.remove(1);
        System.out.println(name);

    }
}
