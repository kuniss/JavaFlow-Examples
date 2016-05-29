package de.grammarcraft.javaflow.examples.convertroman.operations.conversions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FromRomanConversion 
{
    public static int Convert(String romanNumber) {
        int[] values = mapRomanNumberToValues(romanNumber);
        int[] negatedValues = applySubstrationRule(values);
        return sumOf(negatedValues);
    }

    static Map<Character, Integer> mapR2I = new HashMap<Character, Integer>();
    static {
        mapR2I.put('I', 1);
        mapR2I.put('V', 5);
        mapR2I.put('X', 10);
        mapR2I.put('L', 50);
        mapR2I.put('C', 100);
        mapR2I.put('D', 500);
        mapR2I.put('M', 1000);
    }
    
    private static int[] mapRomanNumberToValues(String romanNumber) {
        return romanNumber.chars().map(Character::toUpperCase).map(d -> mapR2I.get((char)d)).toArray();
    }
    
    private static int[] applySubstrationRule(int[] values) {
        int[] negatedValues = new int[values.length];
        System.arraycopy(values, 0, negatedValues, 0, values.length);

        for (int i = 0; i < negatedValues.length - 1; i++) { 
			if (negatedValues [i + 1] > negatedValues [i])
				negatedValues[i] *= -1;
        }

        return negatedValues;
    }
    
    private static int sumOf(int[] values) {
    	return Arrays.stream(values).reduce(0, Integer::sum);
    }
}

