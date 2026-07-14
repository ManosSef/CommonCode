package me.manossef.commoncode.function;

@FunctionalInterface
public interface ByteFunction<T> {
    T apply(byte value);
}