import static java.lang.Math.*;

import java.util.*;

public class zadanie_6_8 {
    public static class Function {
        public static double FunctionMy1(double x, double y, double z) {
            int a = 1, b = 1, c = 1;
            if ((cos(y * y * y * (x + 2 * z)) <= 0) || (y<= 0)) {
                return 0;
            } else {
                return a * b * c * ((pow(cos(y * y * y * (x + 2 * z)), E) + pow(PI, 5) * ((x + 1) / (2 + y))) / (sin(x * y + E + pow(y, z)) + 5 * z));
            }
        }

        public static double FunctionMy2(double y) {
            int n = 2,x=1, z=2;
            if ((cos(y * y * y * (x + 2 * z)) <= 0) || (y < 0)) {
                return 0;
            } else {
                return y * y + (0.5 * n + 4.8) / (sin(y) + E);
            }
        }
    }

    public static void main(String args[]) {
        Scanner B8 = new Scanner(System.in);
        System.out.println("Вам необходимо ввести y 10 раз");
        double S = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Введите y");
            double y = B8.nextDouble();
            S += Function.FunctionMy1(1, y, 2) + Function.FunctionMy2(y);
        }
        System.out.println("найденная сумма равна " + S);
    }
}
