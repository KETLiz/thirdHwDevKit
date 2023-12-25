public class Pair<T, S> {
    T t;
    S s;

    public Pair(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public T getFirst() {
        return t;
    }

    public S getSecond() {
        return s;
    }

    public String toString() {
        return "Первое значение: " + t + ", второе значение: " + s;
    }
}
