package me.manossef.commoncode.function;

@FunctionalInterface
public interface ShortFunction<T> {
    T apply(short value);
}