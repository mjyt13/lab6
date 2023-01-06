import java.util.*;

import static java.lang.System.*;
import static java.lang.Math.*;

public class Zadanie_6_1 {
    public static void main(String[] args) {
        Scanner W1 = new Scanner(System.in);
        out.println("введите число N, характеризующее количество первых членов ряда");
        int N = W1.nextInt();
        int i = 1;
        out.println("введите число M, которое будет больше найденной суммы");
        double M = W1.nextDouble();
        out.println("введите переменную x");
        double x = W1.nextDouble();
        double S = 0, s0 = 0;
        for (i = 1; i <= N; i++) {
            S = S + ((pow(x, (2 * i) - 1)) / (cos(i) + sin(i)));
            if (pow(x, (2 * i) - 1) / (cos(i) + sin(i)) < M) {
                s0 += ((pow(x, (2 * i) - 1)) / (cos(i) + sin(i)));
            }
        }
        out.println("сумма первых N членов ряда равна " + S);
        out.println("сумма членов ряда, меньших M равна " + s0);
    }
}
