package de.grammarcraft.javaflow.examples.convertroman.integration.head;

import de.grammarcraft.javaflow.examples.convertroman.contracts.IBody;
import de.grammarcraft.javaflow.examples.convertroman.contracts.IInputProvider;
import de.grammarcraft.javaflow.examples.convertroman.contracts.IOutputProvider;

class Head 
{
	IInputProvider input;
	IBody body;
	IOutputProvider output;

	public Head(IInputProvider input, IBody body, IOutputProvider output) {
		this.output = output;
		this.body = body;
		this.input = input;
	}

	public void run() {
		String number = this.input.read_number_to_convert();
		this.body.Convert (number,
			result -> this.output.display_result(result),
			errorMessage -> this.output.display_error(errorMessage));
	}
	
}