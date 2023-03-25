package test;

import genericos.ClaseGenericas;

public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenericas<Integer> objetoInt = new ClaseGenericas(15);
        objetoInt.obtenerTipo();
        
        ClaseGenericas<String> objetoString = new ClaseGenericas("Juan");
        objetoString.obtenerTipo();
        
        
    }
}
