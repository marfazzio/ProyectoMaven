package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Persona unaPersona = new Persona();
        unaPersona.setNombre("Marga");

        Persona otraPersona = new Persona("Juan", 2);
        System.out.println(unaPersona.toString());

    }
}