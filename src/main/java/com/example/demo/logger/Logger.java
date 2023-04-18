package com.example.demo.logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static final String LOG_FILE_NAME = "log.txt";

    public static void log(String message) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = now.format(formatter);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(LOG_FILE_NAME, true))) {
            String msg = timestamp + " - " + message;
            bw.write(msg);
            bw.newLine();
            System.out.println(msg);
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }
}
