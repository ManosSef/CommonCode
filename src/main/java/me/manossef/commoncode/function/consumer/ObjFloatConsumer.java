package me.manossef.commoncode.function.consumer;

@FunctionalInterface
public interface ObjFloatConsumer<T> {
    void accept(T t, float value);
}