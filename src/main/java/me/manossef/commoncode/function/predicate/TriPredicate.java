package me.manossef.commoncode.function.predicate;

@FunctionalInterface
public interface TriPredicate<T, U, V> {
    boolean test(T t, U u, V v);
}