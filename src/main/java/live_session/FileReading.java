package live_session;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;


public class FileReading {

    public static void main(String[] args) {
        try {


            Scanner scanner = new Scanner(new File("./src/main/resources/output.txt"));

			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
