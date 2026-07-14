package me.manossef.commoncode;

import me.manossef.commoncode.function.predicate.BooleanBinaryOperator;

public class BooleanOperators {
    public static final BooleanBinaryOperator FALSE = (b1, b2) -> false;
    public static final BooleanBinaryOperator NOT_OR = (b1, b2) -> !b1 && !b2;
    public static final BooleanBinaryOperator ONLY_SECOND = (b1, b2) -> b2 && !b1;
    public static final BooleanBinaryOperator NOT_FIRST = (b1, b2) -> !b1;
    public static final BooleanBinaryOperator ONLY_FIRST = (b1, b2) -> b1 && !b2;
    public static final BooleanBinaryOperator NOT_SECOND = (b1, b2) -> !b2;
    public static final BooleanBinaryOperator NOT_SAME = (b1, b2) -> b1 != b2;
    public static final BooleanBinaryOperator NOT_AND = (b1, b2) -> !b1 || !b2;
    public static final BooleanBinaryOperator AND = (b1, b2) -> b1 && b2;
    public static final BooleanBinaryOperator SAME = (b1, b2) -> b1 == b2;
    public static final BooleanBinaryOperator SECOND = (b1, b2) -> b2;
    public static final BooleanBinaryOperator CAUSES = (b1, b2) -> !b1 || b2;
    public static final BooleanBinaryOperator FIRST = (b1, b2) -> b1;
    public static final BooleanBinaryOperator CAUSED_BY = (b1, b2) -> b1 || !b2;
    public static final BooleanBinaryOperator OR = (b1, b2) -> b1 || b2;
    public static final BooleanBinaryOperator TRUE = (b1, b2) -> true;

    private BooleanOperators() {
    }
}