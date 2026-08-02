package me.manossef.commoncode.objects;

import me.manossef.commoncode.CollectionUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;

public class NoNullHashMap<K, V> extends HashMap<K, V> {
    public NoNullHashMap() {
        super();
    }

    public NoNullHashMap(int initialCapacity) {
        super(initialCapacity);
    }

    public NoNullHashMap(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public NoNullHashMap(Map<? extends K, ? extends V> m) {
        super(CollectionUtils.requireNoNulls(m, "This map does not allow null keys",
            "This map does not allow null values"));
    }

    public V put(K k, V v) {
        return super.put(Objects.requireNonNull(k, "This map does not allow null keys"),
            Objects.requireNonNull(v, "This map does not allow null values"));
    }

    public void putAll(Map<? extends K, ? extends V> m) {
        super.putAll(CollectionUtils.requireNoNulls(m, "This map does not allow null keys",
            "This map does not allow null values"));
    }

    public V putIfAbsent(K key, V value) {
        return super.putIfAbsent(Objects.requireNonNull(key, "This map does not allow null keys"),
            Objects.requireNonNull(value, "This map does not allow null values"));
    }

    public boolean replace(K key, V oldValue, V newValue) {
        return super.replace(key, oldValue, Objects.requireNonNull(newValue, "This map does not allow null values"));
    }

    public V replace(K key, V value) {
        return super.replace(key, Objects.requireNonNull(value, "This map does not allow null values"));
    }

    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
        super.replaceAll(function.andThen(
            v -> Objects.requireNonNull(v, "This map does not allow null values")
        ));
    }
}