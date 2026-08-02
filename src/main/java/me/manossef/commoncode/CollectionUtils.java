package me.manossef.commoncode;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

public class CollectionUtils {
    private CollectionUtils() {
    }

    public static <E> Collection<? extends E> requireNoNulls(Collection<? extends E> c, String message) {
        for(E e : c) Objects.requireNonNull(e, message);
        return c;
    }

    public static <K, V> Map<? extends K, ? extends V> requireNoNulls(Map<? extends K, ? extends V> m, String keyMessage, String valueMessage) {
        for(Map.Entry<? extends K, ? extends V> e : m.entrySet()) {
            Objects.requireNonNull(e.getKey(), keyMessage);
            Objects.requireNonNull(e.getValue(), valueMessage);
        }
        return m;
    }
}