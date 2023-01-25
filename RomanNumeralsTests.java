import org.junit.Test;
import static org.junit.Assert.*;

public class RomanNumeralsTests {

    @Test
    public void testConvertI() {
        assertEquals("I", RomanNumerals.convert(1));
    }

    @Test
    public void testConvertIV() {
        assertEquals("IV", RomanNumerals.convert(4));
    }

    @Test
    public void testConvertV() {
        assertEquals("V", RomanNumerals.convert(5));
    }

    @Test
    public void testConvertIX() {
        assertEquals("IX", RomanNumerals.convert(9));
    }

    @Test
    public void testConvertX() {
        assertEquals("X", RomanNumerals.convert(10));
    }

    @Test
    public void testConvertXL() {
        assertEquals("XL", RomanNumerals.convert(40));
    }

    @Test
    public void testConvertL() {
        assertEquals("L", RomanNumerals.convert(50));
    }

    @Test
    public void testConvertXC() {
        assertEquals("XC", RomanNumerals.convert(90));
    }

    @Test
    public void testConvertC() {
        assertEquals("C", RomanNumerals.convert(100));
    }

    @Test
    public void testConvertCD() {
        assertEquals("CD", RomanNumerals.convert(400));
    }

    @Test
    public void testConvertD() {
        assertEquals("D", RomanNumerals.convert(500));
    }

    @Test
    public void testConvertCM() {
        assertEquals("CM", RomanNumerals.convert(900));
    }

    @Test
    public void testConvertM() {
        assertEquals("M", RomanNumerals.convert(1000));
    }
}
