package input_output;

import java.util.Scanner;

public class PrintYourAgeFromInput {
    public static void main(String... args){
        var input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        System.out.printf("Your age is %s", input.next()); input.close();
    }
}
