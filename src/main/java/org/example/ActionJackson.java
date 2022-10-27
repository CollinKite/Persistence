package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ActionJackson {
    private final File file = new File("entries.json");

    public void save(OneJournal entry) throws IOException {
        List<OneJournal> entries = findAll();
        entries.add(entry);
        ObjectMapper om = new ObjectMapper();
        om.findAndRegisterModules();// use this if using less common datatypes like LocalDateTime
        ObjectWriter ow = om.writer(new DefaultPrettyPrinter());
        ow.writeValue(file, entries);
        //om.writeValue(file, entries);
    }

    public List<OneJournal> findAll() throws IOException {
        if(!file.exists()) {
            return new ArrayList<>();
        }
        ObjectMapper om = new ObjectMapper();
        om.findAndRegisterModules();// use this if using less common datatypes like LocalDateTime
        List<OneJournal> entries = om.readValue(file, new TypeReference<List<OneJournal>>() {});
        System.out.println(entries);
        return entries;
    }

    public OneJournal findById(int id) throws IOException {
        System.out.println("into findById: " + id);
        List<OneJournal> entries;
        entries = findAll();
    }
}
