public class Calculator {

    /**
     * Сложение 2 чисел
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @param <T1> тип данных для первого слагаемого
     * @param <T2> тип данных для второго слагаемого
     */
    public static <T1 extends Number, T2 extends Number> void sum(T1 a, T2 b) {
        System.out.println(a.doubleValue() + b.doubleValue());
    }

    /**
     * Умножение 2 чисел
     * @param a первый множитель
     * @param b второй множитель
     * @param <T1> тип данных первого множителя
     * @param <T2> тип данных второго множителя
     */
    public static <T1 extends Number, T2 extends Number> void multiply(T1 a, T2 b) {
        System.out.println(a.doubleValue()*b.doubleValue());
    }

    /**
     * Деление 2 чисел
     * @param a делимое
     * @param b делитель
     * @param <T1> тип данных делимого
     * @param <T2> тип данных делителя
     */
    public static <T1 extends Number, T2 extends Number> void divide(T1 a, T2 b) {
        if(b.doubleValue() == 0) {
            throw new ArithmeticException("На 0 делить нельзя");
        }
        System.out.println(a.doubleValue()/b.doubleValue());
    }

    public static <T1 extends Number, T2 extends Number> void subtract(T1 a, T2 b) {
        System.out.println(a.doubleValue()-b.doubleValue());
    }
}
