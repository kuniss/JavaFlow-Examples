package de.grammarcraft.javaflow.examples.convertroman.operations.conversions;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.regex.Pattern;

public class RomanConversions {
    
    public static void determineNumberType (
			String number, 
			Consumer<String> onRomanNumber, IntConsumer onArabicNumber) 
	{
        try {
            onArabicNumber.accept(Integer.parseInt(number));
        }
        catch (NumberFormatException e) {
            onRomanNumber.accept(number);
        }
	}

    public static void validateRomanNumber (
    		String romanNumber,
    		Runnable isValid, Consumer<String> isInvalid) 
    {
        if (Pattern.matches("^[IVXLCDM]+$", romanNumber.toUpperCase()))
            isValid.run();
        else
            isInvalid.accept(String.format("Invalid roman digit found in '%s'", romanNumber));
    }
    
    public static void validateArabicNumber(
    		Integer arabicNumber,
    		Runnable isValid, Consumer<String> isInvalid) 
    {
        if (arabicNumber >= 0 && arabicNumber <= 3000)
            isValid.run();
        else
        	isInvalid.accept(
        			String.format("Invalid arabic number '%s'; must be in range 1..3000", arabicNumber));
    }
    
}
