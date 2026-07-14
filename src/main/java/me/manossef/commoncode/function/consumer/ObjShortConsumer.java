package me.manossef.commoncode.function.consumer;

@FunctionalInterface
public interface ObjShortConsumer<T> {
    void accept(T t, short value);
}