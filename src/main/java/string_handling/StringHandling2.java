package string_handling;

import java.util.Arrays;

public class StringHandling2 {
    public static void main(String... args){
        var array1 = new String[] {" i want ", " to learn ", " how to code! "};
        var array2 = new String[3];
        for (int i = 0; i < array2.length; i++)
            array2[i] = array1[i].strip();

        System.out.println(!(array2[0].equals("I want") == array2[1].equalsIgnoreCase("To learn")));
    }
}
