
//1.Write a program to show the use of the ArrayList class of Java.util package [ In-built]
// import java.util.ArrayList;

// public class exp9 {

//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<String>();
//         list.add("A");
//         list.add("B");
//         list.add("C");
//         System.out.println(list);
//         list.add(1, "D");
//         System.out.println(list);
//         list.remove(2);
//         System.out.println(list);
//         System.out.println(list.get(1));
//         System.out.println(list.size());
//     }
// }

import Advcalculate.calculator;

public class exp9 {

    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println(c.add(1, 2));
        System.out.println(c.substract(1, 2));
        System.out.println(c.multiply(1, 2));
        System.out.println(c.divide(1, 2));
        System.out.println(c.modulo(1, 2));
    }
}