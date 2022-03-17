package com.abstr;

import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        StackTraceElement<String> birds=new StackTraceElement();

        birds.push("Peacock");
        birds.push("Eagle");
        birds.push("Bat");
        birds.push("Parrot");
        System.out.println(birds);
        birds.pop();
        System.out.println(birds);

        int x = birds.search("Parrot");
        System.out.println(x);

    }

}
