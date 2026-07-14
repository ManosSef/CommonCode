package me.manossef.commoncode.function.tointfunction;

@FunctionalInterface
public interface BooleanToIntFunction {
    int apply(boolean value);
}