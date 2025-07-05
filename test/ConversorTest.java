import static org.junit.Assert.*;
import org.junit.Test;

public class ConversorTest {
    @Test
    public void testFtoC() {
        assertEquals(0.0, Conversor.fahrenheitParaCelsius(32), 0.001);
    }

    @Test
    public void testCtoF() {
        assertEquals(212.0, Conversor.celsiusParaFahrenheit(100), 0.001);
    }
}