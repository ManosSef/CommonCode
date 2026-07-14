package me.manossef.commoncode.function;

@FunctionalInterface
public interface BooleanFunction<T> {
    T apply(boolean value);
}