//Annotations Assi Que 1
//package com.abstr;
//
//public class bank {
//    public void getinterestrate(){
//        System.out.println("Interest rate of rbi is : 7 ");
//    }
//}
//class sbi extends bank{
//    @Override
//    public void getinterestrate(){
//        System.out.println("Interest rate of sbi is : 7.5 ");
//    }
//}
//class axis extends bank{
//    @Override
//    public void getinterestrate(){
//        System.out.println("Interest rate of axis is : 8 ");
//    }
//}
//class icici extends bank{
//    @Override
//    public void getinterestrate(){
//        System.out.println("Interest rate of icici is : 7.5 ");
//    }
//}
//class Annotation_assi{
//    public static void main(String[] args) {
//        sbi s = new sbi();
//        axis a = new axis();
//        icici i = new icici();
//        s.getinterestrate();
//        a.getinterestrate();
//        i.getinterestrate();
//    }
//}

//Annotation Assi que 2
package com.abstr;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
    String name();
    int age();
    String address();
    String email();
    String phone();
}
class empl{
    @MyAnnotation(name = "Sania Shinde", age = 20 , address = "Satara ",
            email = "sania.shinde18@vit.edu", phone = "8669119830")
    public void sayHello(){System.out.println("Done");}
}
class bank{
    public static void main(String args[])throws Exception{
        empl h=new empl();
        Method m=h.getClass().getMethod("sayHello");
        MyAnnotation manno=m.getAnnotation(MyAnnotation.class);
        System.out.println("name: "+manno.name());
        System.out.println("age: "+manno.age());
        System.out.println("address: "+manno.address());
        System.out.println("email: "+manno.email());
        System.out.println("phone no.: "+manno.phone());
    }}