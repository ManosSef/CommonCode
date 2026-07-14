package me.manossef.commoncode.function.tocharfunction;

@FunctionalInterface
public interface ToCharBiFunction<T, U> {
    char apply(T t, U u);
}