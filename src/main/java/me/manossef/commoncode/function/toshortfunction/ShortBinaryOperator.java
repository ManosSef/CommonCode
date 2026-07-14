package me.manossef.commoncode.function.toshortfunction;

@FunctionalInterface
public interface ShortBinaryOperator {
    short applyAsShort(short left, short right);
}