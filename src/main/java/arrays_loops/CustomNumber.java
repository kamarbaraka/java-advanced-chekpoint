package arrays_loops;

import java.util.Random;

public class CustomNumber {
    private int number;

    public CustomNumber(){
        var random = new Random().nextInt(1, 12);
        System.out.println(random);
        number = random;
    }

    public void getMultiplicationTable(){
        for (int i = this.number; i >0; i--)
            System.out.printf("%d ", this.number * i);;
    }
    public static void main(String... args){
        new CustomNumber().getMultiplicationTable();
    }
}
