package me.manossef.commoncode.function.predicate;

@FunctionalInterface
public interface BooleanBinaryOperator {
    boolean applyAsBoolean(boolean left, boolean right);
}