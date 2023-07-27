package org.example.mvc;

import org.example.impl.CountImpl;

import java.io.*;

public class Counter implements CountImpl, AutoCloseable {
    String path = "src/main/java/org/example/DataBase/counter.txt";
    Integer count;
    BufferedReader br;
    FileWriter fw;

    public Counter() throws IOException {
        this.br = new BufferedReader(new FileReader(path));
        this.count = Integer.parseInt(br.readLine());
        this.fw = new FileWriter(path);
    }


    @Override
    public void add() throws IOException {
        count++;
        fw.write(count.toString());
        fw.flush();
    }

    @Override
    public void close() throws Exception {
        br.close();
        fw.close();
    }
}
