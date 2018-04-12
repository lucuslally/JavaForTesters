// page 32

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerTestExamples {

    @Test
    void integerExploration(){
        Integer four = 4;
        assertEquals(4, four.intValue(),"intValue returns int 4");

        Integer five = 5;
        assertEquals(5, five.intValue(),"intValue returns int 5" );

    }

    @Test
    static void toHexStringExercises(){
        // 11 to b
        Integer eleven = 11;
        assertEquals('b' , eleven.toHexString(11), "Hex String 11 to b");

        // 10 to a
        Integer ten = 10;
        assertEquals('a' , eleven.toHexString(10), "Hex String 10 to a");

        // 3 to 3
        Integer three = 3;
        assertEquals(3 , eleven.toHexString(3), "Hex String 3 to 3");

        // 21 to 15
        Integer twentyone = 21;
        assertEquals(15 , eleven.toHexString(21), "Hex String 21 to 15");
    }


}
