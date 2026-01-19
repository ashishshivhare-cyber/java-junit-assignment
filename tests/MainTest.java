import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void testPrime2() {
        assertTrue(Main.isPrime(2));
    }

    @Test
    void testPrime9() {
        assertFalse(Main.isPrime(9));
    }

    @Test
    void testPrime13() {
        assertTrue(Main.isPrime(13));
    }

    @Test
    void testEdgeCase1() {
        assertFalse(Main.isPrime(1));
    }
}
