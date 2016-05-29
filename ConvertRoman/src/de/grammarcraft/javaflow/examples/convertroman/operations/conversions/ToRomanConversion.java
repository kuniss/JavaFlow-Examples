package de.grammarcraft.javaflow.examples.convertroman.operations.conversions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToRomanConversion 
{
    public static String Convert(int arabicNumber) {
        List<Integer> factors = factorizeArabicNumber(arabicNumber);
        List<String> digits = mapFactorsToDigits(factors);
        return buildFromDigits(digits);
    }

    private static Map<Integer, String> MAP = new HashMap<Integer, String>();
    static {
        MAP.put(1000, "M"); 
        MAP.put(900, "CM"); 
        MAP.put(500, "D"); 
        MAP.put(400, "CD");
        MAP.put(100, "C"); 
        MAP.put(90, "XC"); 
        MAP.put(50, "L"); 
        MAP.put(40, "XL");
        MAP.put(10, "X"); 
        MAP.put(9, "IX"); 
        MAP.put(5, "V"); 
        MAP.put(4, "IV");
 		MAP.put(1, "I");
    }
    private static List<Integer> sortedKeys = MAP.keySet().stream().sorted((Integer f1, Integer f2) -> Integer.compare(f2, f1)).collect(Collectors.toList());
    
    private static List<Integer> factorizeArabicNumber(int arabicNumberIn) {
        List<Integer> factors = new ArrayList<>();
        int arabicNumber = arabicNumberIn;
        while (arabicNumber > 0) {
            for (Integer f : sortedKeys) {
                while (arabicNumber >= f) {
                    factors.add(f);
                    arabicNumber -= f;
                }
            }
        }
        return factors;
    }
 
    private static List<String> mapFactorsToDigits(List<Integer> factors) {
        return factors.stream().map(f -> MAP.get(f)).collect(Collectors.toList());
    }
    
	private static String buildFromDigits(List<String> digits) {
		return digits.stream().collect(Collectors.joining());
	}

}