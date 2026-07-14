package me.manossef.commoncode.function.tocharfunction;

@FunctionalInterface
public interface CharBinaryOperator {
    char applyAsChar(char left, char right);
}