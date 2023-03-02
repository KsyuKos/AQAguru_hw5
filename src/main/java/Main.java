import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //элементарная арифметика
        int a;
        int b;
        int c;
        a = 5;
        b = a + 10;
        System.out.println(a + b);

        ArrayList<Integer> arr = new ArrayList<>();
        int i, n = 10;
        for (i = 1; i <= n; i++) {
            arr.add(i);
        }

        Examples.checkTrue(4,5); //условие
        Examples.checkTwoCondistions(new Double(-5.5), 6); //двойное условие
        Examples.checkOverFull(2147483647); //переполнение вызовет ошибку при компиляции
        Examples.findMax(arr);


    }
}

