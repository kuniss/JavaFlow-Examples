package de.grammarcraft.javaflow.examples.convertroman.operations.providers;

import java.util.Scanner;
import de.grammarcraft.javaflow.examples.convertroman.contracts.IOutputProvider;
import de.grammarcraft.javaflow.examples.convertroman.contracts.IInputProvider;

public class Providers implements IInputProvider, IOutputProvider {
    
    @Override
	public String read_number_to_convert() {
        try (Scanner s = new Scanner(System.in)) {
	        System.out.print("Enter roman or arabic number: ");
	        return s.nextLine().trim();
        }
    }
    
    @Override
	public void display_result(String result) {
        System.out.println(result);
    }
    
    @Override
	public void display_error(String errorMessage) {
        System.out.println("Error: " + errorMessage);
    }
    
}