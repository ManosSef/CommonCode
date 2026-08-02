package me.manossef.commoncode.objects;

import java.util.Objects;
import java.util.Optional;

public sealed abstract class Either<L, R> {
    public abstract Optional<L> left();

    public abstract Optional<R> right();

    public static <L, R> Either<L, R> ofLeft(L value) {
        return new Left<>(value);
    }

    public static <L, R> Either<L, R> ofRight(R value) {
        return new Right<>(value);
    }

    private static final class Left<L, R> extends Either<L, R> {
        private final L left;

        private Left(L left) {
            this.left = Objects.requireNonNull(left);
        }

        @Override
        public Optional<L> left() {
            return Optional.of(this.left);
        }

        @Override
        public Optional<R> right() {
            return Optional.empty();
        }
    }

    private static final class Right<L, R> extends Either<L, R> {
        private final R right;

        private Right(R right) {
            this.right = Objects.requireNonNull(right);
        }

        @Override
        public Optional<L> left() {
            return Optional.empty();
        }

        @Override
        public Optional<R> right() {
            return Optional.of(this.right);
        }
    }
}