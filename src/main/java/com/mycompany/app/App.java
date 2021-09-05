package com.mycompany.app;

/**
 * Hello world Pull!
 */
public class App
{

    private final String message = "Hello World Jenkins";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
