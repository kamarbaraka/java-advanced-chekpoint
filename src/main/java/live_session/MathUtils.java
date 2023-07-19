package live_session;

import java.util.Arrays;

public class MathUtils {

    public int add(int... numbers){
        return Arrays.stream(numbers).reduce(Integer::sum).stream().toArray()[0];
    }

    public int subtract(int... numbers){
        return Arrays.stream(numbers).reduce((x,y) -> x-y).stream().toArray()[0];
    }

    public int divide(int no1, int no2){
        return no1 - no2;
    }

    public int modulo(int no1, int no2){
        return no1 % no2;
    }
}
