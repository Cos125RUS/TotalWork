package org.example;

import org.example.mvc.Creator;
import org.example.mvc.DataBase;
import org.example.mvc.Registry;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
//        System.out.println("1651.5".matches("[^a-z]+"));
//        if ("16.515.571".contains(".")) {
//            String[] s = "16.515.5.71".replace(".", "/").split("/");
//            System.out.println(s.length);
//        }
//        Calendar c = new GregorianCalendar(2017,5 - 1,12);
//        System.out.println(c.get(Calendar.MONTH));
//        System.out.println(c.getTime());
//        try {
//            FileWriter fw = new FileWriter("src/main/java/org/example/DataBase/db.txt");
//            fw.write("Spock 11.02.1999  sleep   (Pet/Dog)");
//            fw.flush();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
        DataBase db = new DataBase();
        try {
            String reg = db.load();
            Creator cr = new Creator();
            cr.loadDB(reg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
