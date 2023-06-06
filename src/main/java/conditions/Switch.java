package conditions;

import java.util.ArrayList;
import java.util.Scanner;

public class Switch {
    public static void main(String... args) {
        var list = new ArrayList<String>();
        while (true){
            var input = new Scanner(System.in).next();
            switch (input){
                case "size" -> System.out.println(list.size());
                case "clear" -> list.clear();
                case "print" -> System.out.println(list);
                case "exit" -> System.exit(2);
                default -> list.add(input);
            }
        }
    }
}
