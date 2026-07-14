package me.manossef.commoncode.function.toshortfunction;

@FunctionalInterface
public interface ToShortFunction<T> {
    short apply(T t);
}