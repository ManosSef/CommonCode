package me.manossef.commoncode.function.tocharfunction;

@FunctionalInterface
public interface ToCharFunction<T> {
    char apply(T t);
}