package de.grammarcraft.javaflow.examples.convertroman;

import org.junit.Test;
import static org.junit.Assert.*;

import de.grammarcraft.javaflow.examples.convertroman.operations.conversions.FromRomanConversion;
import de.grammarcraft.javaflow.examples.convertroman.operations.conversions.ToRomanConversion;

public class ConversionTest {
    
    private void test_from_roman(String romanNumber, int arabicNumber) {
        assertEquals(arabicNumber, FromRomanConversion.Convert(romanNumber));
    }

    @Test
    public void test_from_roman() {
        test_from_roman("I", 1);
        test_from_roman("IV", 4);
        test_from_roman("MCMLXXXIV", 1984);
        test_from_roman("MMXV", 2015);
    }
    
    private void test_to_roman(int arabicNumber, String romanNumber) {
        assertEquals(romanNumber, ToRomanConversion.Convert(arabicNumber));
    }
    
    @Test
    public void test_to_roman() {
        test_to_roman(1, "I");
        test_to_roman(4, "IV");
        test_to_roman(1984, "MCMLXXXIV");
        test_to_roman(2015, "MMXV");
    }
}