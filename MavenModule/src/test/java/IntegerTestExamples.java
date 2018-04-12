// page 32 & 33

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerTestExamples {

    @Test
    void integerExploration() {
        Integer four = 4;
        assertEquals(4, four.intValue(), "intValue returns int 4");

        Integer five = 5;
        assertEquals(5, five.intValue(), "intValue returns int 5");

    }
}

class HexStringExamples {

    @Test
    void toHexStringExercises() {
        // 11 to b
        assertEquals("b", Integer.toHexString(11), "Hex String 11 to b");

        // 10 to a
        assertEquals("a", Integer.toHexString(10), "Hex String 10 to a");

        // 3 to 3
        assertEquals("3", Integer.toHexString(3), "Hex String 3 to 3");

        // 21 to 15
        assertEquals("15", Integer.toHexString(21), "Hex String 21 to 15");
    }
}

class ConstantsExamples{

    @Test
    void publicConstantsExercises(){
        Integer minimum = -2147483648;
        assertEquals(-2147483648, Integer.MIN_VALUE, "Minimum value of int is -2147483648");

        Integer maximum = 2147483647;
        assertEquals(2147483647 , Integer.MAX_VALUE, "Maximum value of int is 2147483648");
    }
}
