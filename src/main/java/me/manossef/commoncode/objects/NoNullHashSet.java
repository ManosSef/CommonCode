package me.manossef.commoncode.objects;

import me.manossef.commoncode.CollectionUtils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

public class NoNullHashSet<E> extends HashSet<E> {
    public NoNullHashSet() {
        super();
    }

    public NoNullHashSet(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    public NoNullHashSet(int initialCapacity) {
        super(initialCapacity);
    }

    public NoNullHashSet(Collection<? extends E> c) {
        super(CollectionUtils.requireNoNulls(c, "This set does not allow null elements"));
    }

    public boolean add(E e) {
        return super.add(Objects.requireNonNull(e, "This set does not allow null elements"));
    }

    public boolean addAll(Collection<? extends E> c) {
        return super.addAll(CollectionUtils.requireNoNulls(c, "This set does not allow null elements"));
    }
}