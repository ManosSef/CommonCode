package me.manossef.commoncode.function;

@FunctionalInterface
public interface FloatFunction<T> {
    T apply(float value);
}