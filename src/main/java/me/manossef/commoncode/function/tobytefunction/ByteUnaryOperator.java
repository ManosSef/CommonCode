package me.manossef.commoncode.function.tobytefunction;

@FunctionalInterface
public interface ByteUnaryOperator {
    byte applyAsByte(byte value);
}