package me.manossef.commoncode.objects;

import java.util.Objects;

public record Pair<F, S>(F first, S second) {
    public Pair {
        Objects.requireNonNull(first);
        Objects.requireNonNull(second);
    }
}