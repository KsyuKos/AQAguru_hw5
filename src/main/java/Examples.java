import java.util.ArrayList;

public class Examples {

    public static void checkTrue (int a, int b) {
        if (a > b) {
            System.out.println("Правда");
        } else {
            System.out.println("Ложь");
        }
    }

    public static void checkTwoCondistions (Double a, int b) {
        double c = a + b;
        if (c > 0 && a instanceof Double) {
            System.out.println("a = " + a + " меньше " + b + " и имеет тип " + a.getClass() + "\n" + "сумма = " + c) ;
        } else {
            System.out.println("Одно из условий не выполнено");
        }
    }

    public static void checkOverFull (int a) {
        if( a > 2147483647) {
            System.out.println("Переполнение вычисления");
        } else if (a < -2147483647) {
            System.out.println("Переполнение вычисления");
        } else {
            System.out.println("Переполнение отсутствует");
        }
    }

    public static void findMax (ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (Integer i : arr) {
            if (i < i + 1) {
                max=i;
            }
        }
        System.out.println("Максимальное " + max);
    }



}
