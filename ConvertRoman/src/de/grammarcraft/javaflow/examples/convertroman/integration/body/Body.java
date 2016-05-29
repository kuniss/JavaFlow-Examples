package de.grammarcraft.javaflow.examples.convertroman.integration.body;

import de.grammarcraft.javaflow.examples.convertroman.operations.conversions.ToRomanConversion;
import de.grammarcraft.javaflow.examples.convertroman.contracts.IBody;
import de.grammarcraft.javaflow.examples.convertroman.operations.conversions.FromRomanConversion;
import de.grammarcraft.javaflow.examples.convertroman.operations.conversions.RomanConversions;

import java.util.function.Consumer;

public class Body implements IBody
{
	public void Convert(String number, Consumer<String> onSuccess, Consumer<String> onError) {
		RomanConversions.determineNumberType (number,
			romanNumber -> 
				RomanConversions.validateRomanNumber(romanNumber,
					() -> {
						int result = FromRomanConversion.Convert(romanNumber);
						onSuccess.accept(Integer.toString(result));
					},
					onError),
			arabicNumber ->
				RomanConversions.validateArabicNumber(arabicNumber,
					() -> {
						String result = ToRomanConversion.Convert(arabicNumber);
						onSuccess.accept(result);
					},
					onError));
	}
}
