package me.manossef.commoncode.function.tobytefunction;

@FunctionalInterface
public interface LongToByteFunction {
    byte apply(long value);
}