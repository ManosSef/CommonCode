package me.manossef.commoncode.function.tobytefunction;

@FunctionalInterface
public interface ToByteFunction<T> {
    byte apply(T t);
}