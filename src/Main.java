public class Main {
    public static void main(String[] args) {
//        Calculator.sum(1, 2);
//        Calculator.multiply(4, 0);
//        Calculator.divide(3, 2);
//        Calculator.subtract(10, 25);

        Integer[] array = new Integer[] {1, 2, 3};
        String[] array2 = new String[] {"1", "2", "3"};

        SecondTask s = new SecondTask();
        System.out.println(s.compareArrays(array, array2));

//        Pair<String, Integer> p = new Pair("String", 1);
//        System.out.println(p.getFirst());
//        System.out.println(p.getSecond());
//        System.out.println(p.toString());
    }
}