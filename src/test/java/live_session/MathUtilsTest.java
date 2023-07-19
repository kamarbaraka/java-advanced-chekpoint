package live_session;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    public void additionTest(){

        MathUtils calculator = new MathUtils();
        int res = calculator.add(5, 6);

        assertAll(() -> {
            assertEquals(11, res);
            assertEquals(45, calculator.add(8, 6));
        });
    }

    @Test
    public void subtractionTest(){

        MathUtils calculator = new MathUtils();
        assertAll(() -> {
            assertEquals(8, calculator.subtract(16, 8));
            assertEquals(8, calculator.subtract(17, 8));
        });
    }

    @Test
    public void divisionTest(){
        MathUtils calculator = new MathUtils();

        assertEquals(ArithmeticException.class, calculator.divide(10, 0));
        assertEquals(5, calculator.divide(10, 5));
    }

    @Test
    public void modulloTest(){
        MathUtils calculator = new MathUtils();

        assertEquals(1, calculator.modulo(3, 2));
    }

}