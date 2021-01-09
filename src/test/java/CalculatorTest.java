import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(5, Calculator.add(5, 0),"error in add()");
        assertNotEquals( 0, Calculator.add(1, 2), "error in add()");
    }

    @Test
    void divInt() {
        int nonNullVar = Calculator.divInt(12, 2);
        assertTrue(6 == nonNullVar);
        assertFalse(5 == Calculator.divInt(12, 2));
        assertNotNull(nonNullVar);
    }

    @Test
    void divReal() {
        assertEquals(5, Calculator.divReal(11, 2),1, "error in divReal()");
        assertNotEquals(6, Calculator.divReal(11, 2), "error in divReal()");

        assertNotSame(6, Calculator.divReal(12, 2));
    }
}
