package me.manossef.commoncode.function.tobytefunction;

@FunctionalInterface
public interface ByteBinaryOperator {
    byte applyAsByte(byte left, byte right);
}