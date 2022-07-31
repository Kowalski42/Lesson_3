import org.junit.jupiter.api.*;

public class FirstTest {
    @Test
    void firstTest() {
        boolean x = false;
        for (int i = 0; i < 2; i++) {
            x = true;
        }
        //noinspection ReassignedVariable
        Assertions.assertNotEquals(x, false);
    }

    @Test
    void secondTest() {
        Assertions.assertFalse(3 == 1);
    }
}
