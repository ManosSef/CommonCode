package me.manossef.commoncode.function.tobytefunction;

@FunctionalInterface
public interface ToByteBiFunction<T, U> {
    byte apply(T t, U u);
}