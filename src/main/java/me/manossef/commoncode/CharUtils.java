package me.manossef.commoncode;

import java.util.List;

public class CharUtils {
    private static final List<Character> LETTERS = List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
        'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
    private static final List<Character> NUMBERS = List.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');

    private CharUtils() {
    }

    public static boolean isLetter(char input) {
        return LETTERS.contains(Character.toLowerCase(input));
    }

    public static boolean isNumber(char input) {
        return NUMBERS.contains(input);
    }
}