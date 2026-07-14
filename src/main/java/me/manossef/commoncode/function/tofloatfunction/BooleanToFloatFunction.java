package me.manossef.commoncode.function.tofloatfunction;

@FunctionalInterface
public interface BooleanToFloatFunction {
    float apply(boolean value);
}