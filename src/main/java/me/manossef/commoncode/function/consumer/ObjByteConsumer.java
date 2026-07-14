package me.manossef.commoncode.function.consumer;

@FunctionalInterface
public interface ObjByteConsumer<T> {
    void accept(T t, byte value);
}