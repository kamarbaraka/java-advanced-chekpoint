package arrays_loops.arrays;

import java.util.Arrays;

public class Arr {
    public static void main(String... args){
        var carBrands = new String[] { "BMW", "Toyota", "Audi", "Mazda", "Subaru" };
        System.out.printf("%s \n%s\n", carBrands.length, carBrands[2]);

        var primeNumbers = new int[6];
        var nos = new int[]{1, 2, 3, 5, 7, 11};
        for (int i = 0; i < primeNumbers.length; i++)
            primeNumbers[i] = nos[i];
        System.out.println(Arrays.toString(primeNumbers));
    }
}
