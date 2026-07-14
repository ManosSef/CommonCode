package me.manossef.commoncode.function.tofloatfunction;

@FunctionalInterface
public interface ToFloatBiFunction<T, U> {
    float apply(T t, U u);
}