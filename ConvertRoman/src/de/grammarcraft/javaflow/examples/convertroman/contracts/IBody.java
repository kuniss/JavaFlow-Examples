package de.grammarcraft.javaflow.examples.convertroman.contracts;

import java.util.function.Consumer;

public interface IBody {
	void Convert (String number, Consumer<String> onSuccess, Consumer<String> onError);
}
