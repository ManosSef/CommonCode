package me.manossef.commoncode.function.predicate;

@FunctionalInterface
public interface BooleanUnaryOperator {
    boolean applyAsBoolean(boolean operand);
}