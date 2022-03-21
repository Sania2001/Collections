package com.abstr;
//Annotations
class Base {
    void display(){
        System.out.println("Parent class");
    }
}
class Child extends Base{
    @Override
    void display() {
        super.display();
    }

    @Deprecated     //You are still using deprecated function
    void Calculator(){
        System.out.println("Calculator");
    }

    public @interface Myannotation{    //Custom Annotation
        int age() default 18;
        String name();

    }

    @Myannotation(
            name = "2324"
    )

    public static void main(String[] args) {
        Child c=new Child();
        c.display();

        @SuppressWarnings({"unused","unhecked"})
                int x;

        c.Calculator();
    }
}

