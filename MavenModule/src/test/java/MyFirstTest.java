import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// page 23

public class MyFirstTest {

    @Test
    public void twoPlusTwo(){
        int answer = 2+2;
        assertEquals(4,answer,"2+2");
    }
    @Test
    public void twoMinusTwo(){
        int answer = 2-2;
        assertEquals(0,answer, "2-2");
    }
    @Test
    public void fourDividedByTwo(){
        int answer = 4/2;
        assertEquals(2,answer, "4/2");
    }
    @Test
    public void twoTimesTwo(){
        int answer = 2*2;
        assertEquals(4,answer, "2*2");
    }
}
