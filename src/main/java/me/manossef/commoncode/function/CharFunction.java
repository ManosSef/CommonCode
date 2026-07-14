package me.manossef.commoncode.function;

@FunctionalInterface
public interface CharFunction<T> {
    T apply(char value);
}