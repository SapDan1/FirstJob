package otus.daniyel.java.kz;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Hello world");
        greetings();
        checkSign(9, -20, 10);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(10, 5, true);

    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void selectColor() {

        System.out.println("Зеленый");
    }
    public static void compareNumbers() {

        System.out.println("a < b");
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}

