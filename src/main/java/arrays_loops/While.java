package arrays_loops;

import java.util.*;

public class While {

    public static void fib(){
        var terms = 1;
        int temp1 = 0, temp2 = 1;
        while (terms < 11) {
            System.out.println(temp1);
            var sum = temp1 + temp2;
            temp1 = temp2;
            temp2 = sum;
            terms++;
        }
    }

    public static void numberGuess(){
        System.out.println("welcome!");
        var number = new Random().nextInt(1, 11);
        while (true){
            System.out.println("guess the number");
            var input = new Scanner(System.in).nextInt();
            if (number == input){
                System.out.println("congratulations!");
                break;
            }
            System.out.println("fail");
            if (input == 255) break;
        }
    }
    public static void command(){
        String input = "";
        while (!(input.equals("stop"))){
            System.out.println("enter a command");
            input = new Scanner((System.in)).nextLine();
            System.out.println(input);
        }
    }
    public static void listy(){
        var cityNames = List.of("Mombasa", "Nairobi", "Malindi");
    }
    public static void main(String... args){
        While.numberGuess();
    }
}
