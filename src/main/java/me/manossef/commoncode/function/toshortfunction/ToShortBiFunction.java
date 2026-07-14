package me.manossef.commoncode.function.toshortfunction;

@FunctionalInterface
public interface ToShortBiFunction<T, U> {
    short apply(T t, U u);
}