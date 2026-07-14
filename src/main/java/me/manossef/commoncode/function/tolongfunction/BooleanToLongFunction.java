package me.manossef.commoncode.function.tolongfunction;

@FunctionalInterface
public interface BooleanToLongFunction {
    long apply(boolean value);
}