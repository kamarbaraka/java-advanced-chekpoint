package string_handling;


import java.util.Arrays;

public class StringHandling {
    public static void main(String... args){
        var string1 = "United Kingdom";
        var string2 = "Germany";
        var sub1 = string1.substring(0, 6);
        var sub2 = string1.substring(7);
        char[] charArray = "%S %S %S".formatted(sub1, string2, sub2).toCharArray();

        System.out.println(Arrays.toString(charArray));
    }
}
