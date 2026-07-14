package me.manossef.commoncode;

import java.util.Scanner;
import java.util.function.Supplier;

public class InputUtils {
    private InputUtils() {
    }

    public static boolean askYesNoQuestion(Scanner scanner) {
        return askYesNoQuestion(scanner, "y", "n");
    }

    public static boolean askYesNoQuestion(Scanner scanner, String y, String n) {
        return askYesNoQuestion(scanner::nextLine, y, n);
    }

    public static boolean askYesNoQuestion(Supplier<String> interviewer, String y, String n) {
        String answer = interviewer.get();
        while(!answer.equalsIgnoreCase(y) && !answer.equalsIgnoreCase(n)) {
            System.out.println("(" + y + "/" + n + ")");
            answer = interviewer.get();
        }
        return answer.equalsIgnoreCase(y);
    }
}
