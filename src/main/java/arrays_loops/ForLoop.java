package arrays_loops;

import java.util.ArrayList;
import java.util.Arrays;

public class ForLoop {
    public static void main(String... args){
        var arr = new String[] { "monday", "tuesday", "wednesday", "thursday", "friday" };
        for (int i = 0; i < arr.length; i+=2)
            arr[i] = arr[i].toUpperCase();
        System.out.printf(Arrays.toString(arr));
    }

    public static void fibonacci(int noOfTerms){
        int tempNo1 = 0, tempNo2 = 1;
        for (int i = 1; i < noOfTerms; ++i){
            System.out.printf("%s ", tempNo1);
            var sum = tempNo1 + tempNo2;
            tempNo1 = tempNo2;
            tempNo2 = sum;
        }
    }
}
