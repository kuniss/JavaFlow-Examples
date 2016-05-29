package de.grammarcraft.javaflow.examples.convertroman.integration.head;

import de.grammarcraft.javaflow.examples.convertroman.operations.providers.Providers;
import de.grammarcraft.javaflow.examples.convertroman.contracts.IInputProvider;
import de.grammarcraft.javaflow.examples.convertroman.contracts.IOutputProvider;
import de.grammarcraft.javaflow.examples.convertroman.integration.body.Body;

class Program 
{
    public static void main(String[] args) 
    {
        Providers providers = new Providers();
        IInputProvider input = providers;
        IOutputProvider output = providers;
        
        Body body = new Body();
        Head head = new Head(input, body, output);
        
        head.run();
    } 
}