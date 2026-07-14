package me.manossef.commoncode.function.tofloatfunction;

@FunctionalInterface
public interface FloatBinaryOperator {
    float applyAsFloat(float left, float right);
}