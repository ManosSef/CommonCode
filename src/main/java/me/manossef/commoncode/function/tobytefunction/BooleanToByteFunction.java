package me.manossef.commoncode.function.tobytefunction;

@FunctionalInterface
public interface BooleanToByteFunction {
    byte apply(boolean value);
}