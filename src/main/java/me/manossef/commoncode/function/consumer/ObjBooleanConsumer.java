package me.manossef.commoncode.function.consumer;

@FunctionalInterface
public interface ObjBooleanConsumer<T> {
    void accept(T t, boolean value);
}