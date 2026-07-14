package me.manossef.commoncode.function.tocharfunction;

@FunctionalInterface
public interface CharUnaryOperator {
    char applyAsChar(char value);
}