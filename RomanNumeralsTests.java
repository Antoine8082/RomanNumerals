import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

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
    @Test
    public void testConvertExtactMMMMDCCCLXXXVIII() {
        assertEquals("MMMMDCCCLXXXVIII", RomanNumerals.convert(4888));
    }

    @Test(expected = Error.class)
    public void testConvertNegativeValue() {
        RomanNumerals.convert(-1);
    }

    @Test(expected = Error.class)
    public void testConvertTooLowValue() {
        RomanNumerals.convert(0);
    }

    @Test(expected = Error.class)
    public void testConvertTooHighValue() {
        RomanNumerals.convert(5001);
    }
    @Test
    public void testInputMismatchExceptionString() {
        Scanner sc = new Scanner("abc");
        assertThrows(InputMismatchException.class, () -> RomanNumerals.convert(sc.nextInt()));
        sc.close();
    }

    @Test
    public void testInputMismatchExceptionOther() {
        Scanner sc = new Scanner("-+*/");
        assertThrows(InputMismatchException.class, () -> RomanNumerals.convert(sc.nextInt()));
        sc.close();
    }

}
