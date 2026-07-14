package me.manossef.commoncode.function.consumer;

@FunctionalInterface
public interface ObjCharConsumer<T> {
    void accept(T t, char value);
}