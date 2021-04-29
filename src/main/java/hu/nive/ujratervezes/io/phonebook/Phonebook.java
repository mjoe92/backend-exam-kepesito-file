package hu.nive.ujratervezes.io.phonebook;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) throws IOException {

        if (contacts == null || output == null) {
            throw new IllegalArgumentException();
        }

        Writer writer = new FileWriter(output);
        for (Map.Entry<String, String> line : contacts.entrySet()) {
            writer.write(line.getKey() + ": " + line.getValue() + "\n");
        }
        writer.close();
    }

}