package org.example;

import java.io.IOException;
import java.time.LocalTime;

public class Main {

    private static ActionJackson oj = new ActionJackson();

    public static void main(String[] args) throws IOException {
        OneJournal entry = new OneJournal(5, "boodhua9whdawdadiawp", LocalTime.now().toString());
        oj.save(entry);
        oj.findAll();
    }
}