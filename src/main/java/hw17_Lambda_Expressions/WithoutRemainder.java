package hw17_Lambda_Expressions;

@FunctionalInterface
public interface WithoutRemainder<T, V> {
    T withoutRemainder(V v);
}