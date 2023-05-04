package main;

import logic.Fibonacci;

public class Main {
    
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("The 45 sequence fibonacci: ");
        fibonacci.display(45);
    }
    
}
