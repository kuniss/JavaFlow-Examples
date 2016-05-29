import java.util.function.Consumer;
import java.util.function.IntConsumer;

public final class RomanConversions {
	
	public static void determineNumberType(
			String input, 
			IntConsumer onArabicNumber, Consumer<String> onRomanNumber) 
	{
        try {
            onArabicNumber.accept(Integer.parseInt(input));
        }
        catch (NumberFormatException e) {
            onRomanNumber.accept(input);
        }
	}
	
	public static void main(String[] args) {
		determineNumberType("IV", 
				RomanConversions::reportArabicNumber, 
				RomanConversions::reportRomanNumber);
		determineNumberType("44", 
				RomanConversions::reportArabicNumber, 
				RomanConversions::reportRomanNumber);
	}
	
	private static void reportArabicNumber(int i) { System.out.println("arabic number: " + i); }
	private static void reportRomanNumber(String i) { System.out.println("roman number: " + i); }

}
