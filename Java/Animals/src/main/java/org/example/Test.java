package org.example;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
//        System.out.println("1651.5".matches("[^a-z]+"));
//        if ("16.515.571".contains(".")) {
//            String[] s = "16.515.5.71".replace(".", "/").split("/");
//            System.out.println(s.length);
//        }
        Calendar c = new GregorianCalendar(2017,5 - 1,12);
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.getTime());
    }
}
