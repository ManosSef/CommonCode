package me.manossef.commoncode;

import java.io.IOException;

public class Exceptions {
    private Exceptions() {
    }

    public static void feedback(Throwable exception) {
        System.err.println(exception.getClass().getName() + ": " + exception.getMessage());
    }

    public static void feedback(String message, Throwable exception) {
        System.err.println(message + " (" + exception.getClass().getName() + ": " + exception.getMessage() + ")");
    }

    public static void feedbackIO(IOException exception) {
        feedback("Input/output exception occurred!", exception);
    }
}