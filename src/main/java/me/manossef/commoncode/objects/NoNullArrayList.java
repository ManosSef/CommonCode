package me.manossef.commoncode.objects;

import me.manossef.commoncode.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class NoNullArrayList<E> extends ArrayList<E> {
    public NoNullArrayList() {
        super();
    }

    public NoNullArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public NoNullArrayList(Collection<? extends E> c) {
        super(CollectionUtils.requireNoNulls(c, "This list does not allow null elements"));
    }

    @Override
    public void add(int index, E element) {
        super.add(index, Objects.requireNonNull(element, "This list does not allow null elements"));
    }

    @Override
    public boolean add(E e) {
        return super.add(Objects.requireNonNull(e, "This list does not allow null elements"));
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return super.addAll(index, CollectionUtils.requireNoNulls(c, "This list does not allow null elements"));
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return super.addAll(CollectionUtils.requireNoNulls(c, "This list does not allow null elements"));
    }

    @Override
    public E set(int index, E element) {
        return super.set(index, Objects.requireNonNull(element, "This list does not allow null elements"));
    }
}