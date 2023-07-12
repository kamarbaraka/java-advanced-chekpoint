package live_session;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class FileReading {

    public static void main(String[] args) {
        try {
            var path = Path.of("./src/main/resources/test.txt");
            var reader = new Scanner(path, StandardCharsets.UTF_8);


        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
