package pl.sda.jsondataset;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Earthquake dane= objectMapper.readValue(new File("testowy2.json"),Earthquake.class);
            System.out.println(dane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
